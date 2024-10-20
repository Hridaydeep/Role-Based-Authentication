package com.example.SecureApp.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SS")
public class HomeController {

    @GetMapping("/home")
    public String home(){
        return "Welcome Maccha....";
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/User")
    public String userEndPoint(){
        return "Hello User";
    }

    @GetMapping("/Admin")
    public String adminEndPoint(){
        return "Hello Admin";
    }
}
