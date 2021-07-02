package com.example.authenticatingldap;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthenticatingLdapApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(AuthenticatingLdapApplication.class);
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
    }
}