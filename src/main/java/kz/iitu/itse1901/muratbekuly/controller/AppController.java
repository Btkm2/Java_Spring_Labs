package kz.iitu.itse1901.muratbekuly.controller;

import kz.iitu.itse1901.muratbekuly.database.*;
import kz.iitu.itse1901.muratbekuly.service.CarServices.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.*;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableScheduling
public class AppController {

    //Car
    @Autowired //Field-injection
    private CarService carService;

    @Autowired
    private JmsTemplate jmsTemplate;

//    @Scheduled(fixedRate = 1)
//    @Scheduled(fixedDelay = 10, initialDelay = 2000)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @GetMapping("/getCars")
    public List<Car> getALlCars(){
        return carService.getALlCars();
    }

//    @PostMapping("/addCars")
//    public Car AddCars(@RequestBody Car car){
//        return carService.AddCar(car);
//    }

    @PostMapping("/addCars")
    public ResponseEntity<Car> addCar(@RequestBody Car car){ return carService.addCar(car);}

    @GetMapping("/findCarById")
    public Car GetCarsById(@RequestParam Long id){
        return carService.GetCarById(id);
    }

    @PostMapping("/MSG")
    public void send(@RequestBody Car car){
        jmsTemplate.convertAndSend("CarQueue",car);
    }

    @GetMapping("/GetMSG")
    @JmsListener(destination = "CarQueue")
    public String getMSG(Car car){
//        jmsTemplate.receiveAndConvert("CarQueue");
        return car.toString();
    }
    //User
////    @Autowired
//    private UserService userService;
//
//    @Autowired
//    public AppController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @GetMapping("/getUsers")
//    public List<User> GetAllUser(){
//        return userService.getAllUsers();
//    }
//
//    @PostMapping("/addUser")
//    public User AddUsers(@RequestBody User user){
//        return userService.addUser(user);
//    }
//
//    @GetMapping("/findUserById")
//    public Optional<User> GetUserById(@RequestParam Long id){
//        return userService.getUsersById(id);
//    }
}
