package ru.kata.spring.boot_security.demo.Service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.Dto.RoleDTO;
import ru.kata.spring.boot_security.demo.Dto.UserDTO;
import ru.kata.spring.boot_security.demo.Model.Role;
import ru.kata.spring.boot_security.demo.Model.User;

@Service
public class ConverterServiceImpl implements ConverterService {
    private ModelMapper modelMapper;

    public ConverterServiceImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public RoleDTO convertToDto(Role role) {
        return modelMapper.map(role, RoleDTO.class);
    }

    @Override
    public UserDTO convertToDto(User user) {
        return modelMapper.map(user, UserDTO.class);
    }

    @Override
    public User convertToUser(UserDTO userDTO) {
        return modelMapper.map(userDTO, User.class);
    }
}
