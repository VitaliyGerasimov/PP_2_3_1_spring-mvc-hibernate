package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();
    User getUserById(Long id);
    void create(User user);

   void update(long id, User user);

    void deleteUser(Long id);
}
