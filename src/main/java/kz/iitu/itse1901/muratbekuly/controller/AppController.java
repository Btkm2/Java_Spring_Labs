//package kz.iitu.itse1901.muratbekuly.controller;
//
//import kz.iitu.itse1901.muratbekuly.database.*;
//import kz.iitu.itse1901.muratbekuly.service.CarServices.*;
//import kz.iitu.itse1901.muratbekuly.service.UserServices.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//public class AppController {
//
//    //Car
//    @Autowired //Field-injection
//    private CarService carService;
//
//    @GetMapping("/getCars")
//    public List<Car> getALlCars(){
//        return carService.getALlCars();
//    }
//
//    @PostMapping("/addCars")
//    public Car AddCars(@RequestBody Car car){
//        return carService.AddCar(car);
//    }
//
//    @GetMapping("/findCarById")
//    public Car GetCarsById(@RequestParam Long id){
//        return carService.GetCarById(id);
//    }
//
//    //User
//////    @Autowired
////    private UserService userService;
////
////    @Autowired
////    public AppController(UserService userService) {
////        this.userService = userService;
////    }
////
////    @GetMapping("/getUsers")
////    public List<User> GetAllUser(){
////        return userService.getAllUsers();
////    }
////
////    @PostMapping("/addUser")
////    public User AddUsers(@RequestBody User user){
////        return userService.addUser(user);
////    }
////
////    @GetMapping("/findUserById")
////    public Optional<User> GetUserById(@RequestParam Long id){
////        return userService.getUsersById(id);
////    }
//}
