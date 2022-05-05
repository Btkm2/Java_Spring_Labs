package kz.iitu.itse1901.muratbekuly.service.CarServices;

import kz.iitu.itse1901.muratbekuly.database.Car;
import kz.iitu.itse1901.muratbekuly.repository.CarRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Mockito.*;

class CarServiceTest {
    @Mock
    CarRepository carRepository;
    @InjectMocks
    CarService carService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetALlCars() {
        //List<Car> result = carService.getALlCars();
        when(carRepository.findAll()).thenReturn(Stream.of(new Car(1L,"Corolla",15000,"Used","Toyota","2005",10000)).collect(Collectors.toList()));
        //Assertions.assertNotNull(result);
        Assertions.assertEquals(1,carService.getALlCars().size());
//        Assertions.assertEquals(List.of(new Car(Long.valueOf(1), "Model", Integer.valueOf(0), "condition", "manufacturer", "year", Integer.valueOf(0))), result);
    }

    @Test
    void testAddCar() {
//        ResponseEntity<Car> result = carService.addCar(new Car(Long.valueOf(1), "Model", Integer.valueOf(0), "condition", "manufacturer", "year", Integer.valueOf(0)));
//        Assertions.assertEquals(null, result);
        carService.addCar(new Car(Long.valueOf(1),"Accent",40000,"Used","Hyundai","2012",9000));
    }

    @Test
    void testGetCarById() {
//        Car result = carService.GetCarById(Long.valueOf(1));
        Long id = 1L;
        Car car = new Car(id,"Camry",30000,"Used","Toyota","2010",11500);
        Mockito.when(carRepository.findById(id)).thenReturn(Optional.of(car));
//        Assertions.assertEquals(new Car(Long.valueOf(1), "Model", Integer.valueOf(0), "condition", "manufacturer", "year", Integer.valueOf(0)), result);
        Assertions.assertEquals(1,carService.GetCarById(id).getId());
    }

//    @Test
//    void testGetBeanName() {
//        String result = carService.getBeanName();
//        Assertions.assertEquals("replaceMeWithExpectedResult", result);
//    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme