package kz.iitu.itse1901.muratbekuly.service.UserServices;

import kz.iitu.itse1901.muratbekuly.database.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Service
//public class UserService implements UserServiceInterface{
//
//    private UserRepository userRepository;
//
//    @Autowired //Setter
//    public void setUserRepository(UserRepository userRepository){
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    public List<User> getAllUsers() {
//        return userRepository.findAll();
//    }
//
//    @Override
//    public User addUser(User user) {
//        return userRepository.save(user);
//    }
//
//    @Override
//    public Optional<User> getUsersById(Long id) {
//        return userRepository.findById(id);
//    }
//
//    @Value("${test_bean}")
//    private String test_bean;
//
//    public String getTest_bean() {
//        return test_bean;
//    }
//
//    public String getUserBean(){
//        return "It's a User Bean!";
//    }
//}
