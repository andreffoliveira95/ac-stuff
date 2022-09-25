package org.academiadecodigo.hackathon.controller;

import org.academiadecodigo.hackathon.ServiceUser;
import org.academiadecodigo.hackathon.UserDao;
import org.academiadecodigo.hackathon.UserDto;
import org.academiadecodigo.hackathon.converters.UserDtoToUser;
import org.academiadecodigo.hackathon.converters.UserToDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class ControllerRest {
    private ServiceUser serviceUser;
    private UserDtoToUser userDtoToUser;
    private UserToDto userToDto;
    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Autowired
    public void setServiceUser(ServiceUser serviceUser) {
        this.serviceUser = serviceUser;
    }

    @Autowired
    public void setUserDtoToUser(UserDtoToUser userDtoToUser) {
        this.userDtoToUser = userDtoToUser;
    }

    @Autowired
    public void setUserToDto(UserToDto userToDto) {
        this.userToDto = userToDto;
    }



    @RequestMapping(method = RequestMethod.GET, path = "/user/{id}")
    public ResponseEntity<?> listCustomer(@PathVariable Integer id) {

        return new ResponseEntity<>(userToDto.convert(serviceUser.get(id)), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/listusers")
    public ResponseEntity<List<UserDto>> listCustomer() {

        List<UserDto> userDtos = serviceUser.getAll().stream()
                .map(user -> userToDto.convert(user))
                .collect(Collectors.toList());

        return new ResponseEntity<>(userDtos, HttpStatus.OK);
    }
}
