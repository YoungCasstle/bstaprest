package ru.kata.spring.boot_security.demo.Service;

import ru.kata.spring.boot_security.demo.Model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(int id);

    void addUser(User user);

    void changeUser(int id, User replaceUser);

    void deleteUser(int id);

    User findByUsername(String username);


}
