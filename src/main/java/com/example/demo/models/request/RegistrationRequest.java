package com.example.demo.models.request;

import lombok.Data;

@Data
public class RegistrationRequest {
    String firstName;
    String lastName;
    String userName;
    String email;
    String password;
    String state;
    String address;
}
