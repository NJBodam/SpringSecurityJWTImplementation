package com.example.springsecurityjwt.models;

import java.io.Serializable;

public class AuthenticateResponse implements Serializable {

    private final String jwt;

    public AuthenticateResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}
