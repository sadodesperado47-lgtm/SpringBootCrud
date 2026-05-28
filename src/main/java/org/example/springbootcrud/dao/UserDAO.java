package web.dao;

import web.model.User;
import java.util.List;

public interface UserDAO {
    void addUser(User user);
    void updateUser(User user);
    User removeUser(Long id);
    User getUserById(Long id);
    List<User> getAllUsers();
}
