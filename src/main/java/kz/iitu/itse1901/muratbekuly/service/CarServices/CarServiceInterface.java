package kz.iitu.itse1901.muratbekuly.service.CarServices;

import kz.iitu.itse1901.muratbekuly.database.Car;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CarServiceInterface {
    List<Car> getALlCars();
//    Car AddCar(Car car);
    ResponseEntity<Car> addCar(Car car);
    Car GetCarById(Long id);
    String getBeanName();
}
