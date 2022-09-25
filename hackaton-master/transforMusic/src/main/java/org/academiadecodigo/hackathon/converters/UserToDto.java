package org.academiadecodigo.hackathon.converters;

import org.academiadecodigo.hackathon.User;
import org.academiadecodigo.hackathon.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserToDto {

    public UserDto convert(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());
        userDto.setPassword(user.getPassword());
        userDto.setUsername(user.getUsername());

        return userDto;
    }

}
