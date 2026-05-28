package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.User;
import java.util.List;
import web.dao.UserDAO;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO) {

        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public void addUser(User user) {
        this.userDAO.addUser(user);

    }

    @Override
    @Transactional
    public void updateUser(User user) {

        this.userDAO.updateUser(user);
    }

    @Override
    @Transactional
    public User removeUser(Long id) {
        return this.userDAO.removeUser(id);
    }

    @Override
    @Transactional
    public User getUserById(Long id) {

        return this.userDAO.getUserById(id);
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return this.userDAO.getAllUsers();
    }
    }
