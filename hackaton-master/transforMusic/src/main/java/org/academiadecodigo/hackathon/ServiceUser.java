package org.academiadecodigo.hackathon;


import org.academiadecodigo.hackathon.exceptions.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceUser {

    private LinkedList<User> listOfUsers = new LinkedList<>();

    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public User get(Integer id) {
        return userDao.findById(id);
    }

    public List<User> getAll(){
        return userDao.findAll();
    }
    @Transactional
    public User save(User user) {
        listOfUsers.add(user);
        return userDao.saveOrUpdate(user);
    }


    @Transactional
    public void delete(Integer id) throws UserNotFoundException {

        User user = Optional.ofNullable(userDao.findById(id))
                .orElseThrow(UserNotFoundException::new);

        userDao.delete(id);
    }



}
