package net.zm123.rest.controller;

import net.zm123.rest.entry.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user1")
public class UserController1 {
    @PostMapping
    public String save(@RequestBody User user) {
        return "{'action':'save','result':" + user + "}";
    }

    @DeleteMapping(value = "/{id}")
    public String delete(@PathVariable Integer id) {
        return "{'action':'delete','id':" + id + "}";
    }

    @PutMapping
    public String update(@RequestBody User user) {
        return "{'action':'update','result':" + user + "}";
    }

    @GetMapping
    public String getAllUsers() {
        return "{'action':'update','result':" + "all users" + "}";
    }
}
