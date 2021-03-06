package dev.spring.starter.service;

import dev.spring.starter.model.User;
import java.util.List;

public interface UserService {

    void add(User user);

    User get(Long id);

    List<User> listUsers();
}
