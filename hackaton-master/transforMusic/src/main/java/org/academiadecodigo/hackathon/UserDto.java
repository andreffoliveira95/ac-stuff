package org.academiadecodigo.hackathon;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserDto {
    private int id;
    @NotNull(message = "First name is mandatory")
    @NotBlank(message = "First name is mandatory")
    @Size(min = 3, max = 64)
    private String firstName;
    @NotNull(message = "Last name is mandatory")
    @NotBlank(message = "Last name is mandatory")
    @Size(min = 3, max = 64)
    private String lastName;
    @NotNull(message = "Username is mandatory")
    @NotBlank(message = "Username is mandatory")
    @Size(min = 3, max = 64)
    private String username;
    @Email
    @NotBlank(message = "Email name is mandatory")
    private String email;
    @NotNull(message = "Password is mandatory with at least 4 characters")
    @NotBlank(message = "Password is mandatory with at least 4 characters")
    @Size(min = 4, max = 64)
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
