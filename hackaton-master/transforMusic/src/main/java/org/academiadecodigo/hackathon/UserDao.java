package org.academiadecodigo.hackathon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
@Repository
public class UserDao {

    @PersistenceContext
    protected EntityManager em;

    public void setEm(EntityManager em) {
        this.em = em;
    }

    /*public List<User> findAll(){

    }*/

    public List<User> findAll(){
        CriteriaQuery<User> criteriaQuery = em.getCriteriaBuilder().createQuery(User.class);
        Root<User> root = criteriaQuery.from(User.class);
        return em.createQuery(criteriaQuery).getResultList();

    }

    public User findById(Integer id){
       return em.find(User.class,id);
    }

    public User saveOrUpdate(User user){
        return em.merge(user);
    }

    public void delete(Integer id){
        em.remove(em.find(User.class,id));
    }
}
