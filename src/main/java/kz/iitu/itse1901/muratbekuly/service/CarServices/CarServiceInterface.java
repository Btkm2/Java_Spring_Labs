package kz.iitu.itse1901.muratbekuly.service.CarServices;

import kz.iitu.itse1901.muratbekuly.database.Car;

import java.util.List;

public interface CarServiceInterface {
    List<Car> getALlCars();
    Car AddCar(Car car);
    Car GetCarById(Long id);
    String getBeanName();
}
