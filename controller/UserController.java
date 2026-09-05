package com.logistics.controller;

import com.logistics.dto.user.UserCreateRequest;
import com.logistics.dto.user.UserResponse;
import com.logistics.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserResponse> createUser(
            @Valid @RequestBody UserCreateRequest request
    ) {

        UserResponse response = userService.createUser(request);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }

    @GetMapping("/user")
    public ResponseEntity<UserResponse> getCurrentUser(
            Authentication authentication
    ) {

        String email = authentication.getName();

        UserResponse response =
                userService.getUserByEmail(email);

        return ResponseEntity.ok(response);
    }
}