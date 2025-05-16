package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.request.LoginRequest;
import com.example.demo.models.request.RegistrationRequest;
import com.example.demo.models.response.LoginResponse;
import com.example.demo.models.response.RegistrationResponse;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RestController
@RequestMapping("/api")
public class UserController {
    
    @GetMapping(value={"","/"})
    public String hello(){
        return "This is SpringBoot project running!";
    }

    @PostMapping("/login")
    public LoginResponse postMethodName(@RequestBody LoginRequest entity) {
        LoginResponse loginResponse=new LoginResponse();
        log.info("Login Request Recived, userName: {} password: {}", entity.getUserName(), entity.getPassword());        
        if(entity.getUserName().equals("maruti") && entity.getPassword().equals("1234")){
            loginResponse.setUserid("9121");
            loginResponse.setUsername("maruti");
            loginResponse.setToken("jwt-3674tr7eiyr7784bfhdbc");
        }
        return loginResponse;
    }

    @PostMapping("/register")
    public RegistrationResponse postMethodName(@RequestBody RegistrationRequest entity) {
        RegistrationResponse registrationResponse =new RegistrationResponse();
        registrationResponse.setUsername("marutiBandagar");
        registrationResponse.setMessage("Resgistration Successfull!");
        return registrationResponse;
    }
    
    

}
