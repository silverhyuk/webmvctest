package com.silverhyuk.webmvc.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
    @PostMapping("/user")
    public @ResponseBody User create(@RequestBody User user) {
        return null;
    }

    @PostMapping("/user/create")
    public  User userCreate(@RequestBody User user){
        return user;
    }

}
