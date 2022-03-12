package kz.iitu.itse1901.muratbekuly.service.UserServices;

import kz.iitu.itse1901.muratbekuly.database.User;

import java.util.List;
import java.util.Optional;

public interface UserServiceInterface {
    List<User> getAllUsers();
    User addUser(User user);
    Optional<User> getUsersById(Long id);
    String getUserBean();
}
