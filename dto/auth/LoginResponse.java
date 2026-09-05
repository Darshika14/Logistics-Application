package com.logistics.dto.auth;

import com.logistics.enums.UserRole;

public class LoginResponse {

    private String token;
    private String tokenType;
    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private UserRole role;

    public LoginResponse() {
    }

    public LoginResponse(
            String token,
            String tokenType,
            Long userId,
            String firstName,
            String lastName,
            String email,
            UserRole role
    ) {
        this.token = token;
        this.tokenType = tokenType;
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = role;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
}