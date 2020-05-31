package com.server.app.controller;

import java.util.List;

import com.server.app.model.User;
import com.server.app.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/list", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<List<User>> users() {
        List<User> users = userService.findAll();
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }

    @GetMapping("/list2")
    public List<User> users2() {
        return userService.findAll();
    }
}