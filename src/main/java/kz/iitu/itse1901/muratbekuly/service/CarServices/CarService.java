package kz.iitu.itse1901.muratbekuly.service.CarServices;

import kz.iitu.itse1901.muratbekuly.database.*;
import kz.iitu.itse1901.muratbekuly.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@EnableScheduling
public class CarService implements CarServiceInterface{

//    public void setCarRepository(CarRepository carRepository) {
//        this.carRepository = carRepository;
//    }

    private final CarRepository carRepository;

//    @Override
//    public List<Car> getAllCars(){
//        return carRepository.findAll();
//    }

//    @Override
//    public List<Car> getALlCars() {
//        return null;
//    }

    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    @Override
//    @Scheduled(cron = "${schedule.work}")
    public List<Car> getALlCars() {
        return carRepository.findAll();
    }

    public Car AddCar(Car car){
        return carRepository.save(car);
    }

    public Car GetCarById(Long id){
        return carRepository.findById(id).get();
    }

    public String getBeanName(){
        return "It's Car Bean";
    }
}
