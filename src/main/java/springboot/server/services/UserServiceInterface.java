package springboot.server.services;

import springboot.server.entities.User;

import java.util.List;

public interface UserServiceInterface {
    public List<User> getAllUsers();
    public User getUser(Long id);
    public User saveUser(User user); //for update & insert
    public void deleteUser(Long id);
}
