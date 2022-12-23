package ru.kata.spring.boot_security.demo.Service;

import ru.kata.spring.boot_security.demo.Dto.RoleDTO;
import ru.kata.spring.boot_security.demo.Dto.UserDTO;
import ru.kata.spring.boot_security.demo.Model.Role;
import ru.kata.spring.boot_security.demo.Model.User;

public interface ConverterService {
    RoleDTO convertToDto(Role role);

    UserDTO convertToDto(User user);

    User convertToUser(UserDTO userDTO);
}
