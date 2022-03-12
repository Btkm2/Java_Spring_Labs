package kz.iitu.itse1901.muratbekuly.service.CarServices;

import kz.iitu.itse1901.muratbekuly.database.*;
import kz.iitu.itse1901.muratbekuly.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService implements CarServiceInterface{

//    public void setCarRepository(CarRepository carRepository) {
//        this.carRepository = carRepository;
//    }

    private CarRepositoryImplementation carRepository;

//    @Override
//    public List<Car> getAllCars(){
//        return carRepository.findAll();
//    }

//    @Override
//    public List<Car> getALlCars() {
//        return null;
//    }

    @Autowired
    public CarService(CarRepositoryImplementation carRepository){
        this.carRepository = carRepository;
    }


    @Override
    public List<Car> getALlCars() {
        return carRepository.findAll();
    }

    public Car AddCar(Car car){
        return carRepository.save(car);
    }
    public Car GetCarById(Long id){
        return carRepository.findCarById(id);
    }


    public String getBeanName(){
        return "It's Car Bean";
    }
}
