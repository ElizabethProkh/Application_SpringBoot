package ru.prokh.ProjectSpringBoot.Service;


import ru.prokh.ProjectSpringBoot.Model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void saveUser (User user);

    User getUser(int id);

    void updateUser (int id, User updatedUser);

    void deleteUser(int id);
}
