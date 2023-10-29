package com.futureX.services.FutureXUserApp;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository repository;

    @RequestMapping("/")
    public List<User> getUser() {
        return repository.findAll();
    }

    @RequestMapping("{id}")
    public List<User> getUsersForCo0urse(@PathVariable("id") BigInteger id) {
        return repository.findByCourseid(id);
    }
}