package org.academiadecodigo.hackathon.converters;

import org.academiadecodigo.hackathon.ServiceUser;
import org.academiadecodigo.hackathon.User;
import org.academiadecodigo.hackathon.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDtoToUser {

    private ServiceUser serviceUser;

    @Autowired
    public void setServiceUser(ServiceUser serviceUser) {
        this.serviceUser = serviceUser;
    }





    public User convert(UserDto userDto) {

        User user = (userDto != null) ? serviceUser.get(userDto.getId()) : new User();

        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setId(userDto.getId());
        user.setPassword(userDto.getPassword());
        user.setUsername(userDto.getUsername());

        return user;
    }


}
