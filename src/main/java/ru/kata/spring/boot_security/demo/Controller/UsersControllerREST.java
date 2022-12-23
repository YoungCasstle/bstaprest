package ru.kata.spring.boot_security.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kata.spring.boot_security.demo.Dto.UserDTO;
import ru.kata.spring.boot_security.demo.Service.ConverterService;
import ru.kata.spring.boot_security.demo.Service.UserService;

@RestController
@RequestMapping("/user/api")
public class UsersControllerREST {
    private final UserService userService;
    private final ConverterService converter;

    @Autowired
    public UsersControllerREST(UserService userService, ConverterService converter) {
        this.userService = userService;
        this.converter = converter;
    }

    @GetMapping
    public UserDTO getUser(Authentication auth) {
        return converter.convertToDto(userService.findByUsername(auth.getName()));
    }
}
