package com.restservice.springbootrestserviceproject;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {

    @GetMapping // query parameter
    public String getUsers(@RequestParam(value = "page") int pagenum, @RequestParam(value = "limit") int limitnum) { // get users in a page up to the limit
        return "http GET request was sent for page: " + pagenum + " and limit is: " + limitnum;
    }

    @GetMapping(path = "/{userID}")  // path parameter
    public String getUser(@PathVariable String userID) { // get user by id
        return "http GET request was sent for userID: " + userID;
    }

    @PostMapping
    public String createUsers() {
        return "http POST request was sent.";
    }

    @PutMapping
    public String updateUsers() {
        return "http PUT request was sent.";
    }

    @DeleteMapping
    public String deleteUsers() {
        return "http DELETE request was sent.";
    }
}
