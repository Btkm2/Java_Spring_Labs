package kz.iitu.itse1901.muratbekuly.JMS;

import kz.iitu.itse1901.muratbekuly.database.*;
import kz.iitu.itse1901.muratbekuly.repository.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class JMSListener {
    @Autowired
    private CarRepository carRepository;

    @JmsListener(destination = "CarQueue")
    public void receiveMessage(Car car) {
        System.out.println("Received <" + car.toString() + ">");
        carRepository.save(car);
    }
}
