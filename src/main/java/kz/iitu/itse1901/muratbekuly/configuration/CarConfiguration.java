package kz.iitu.itse1901.muratbekuly.configuration;

import kz.iitu.itse1901.muratbekuly.service.CarServices.CarService;
import kz.iitu.itse1901.muratbekuly.service.CarServices.CarServiceInterface;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.GenericApplicationContext;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Configuration
//public class CarConfiguration {
//    @Bean(name = "CarService")
//    @Lazy
//    @Scope("prototype")
//    public CarServiceInterface service(){
//        return new CarService();
//    }
//
//    @PostConstruct
//    public void init(){
//        System.out.println("Init method called...");
//    }
//
//    @PreDestroy
//    public void destroy(){
//        System.out.println("Destroy method called...");
//    }
//
////    GenericApplicationContext applicationContext = new GenericApplicationContext();
////    CarServiceInterface carServiceInterface = (CarServiceInterface) applicationContext.getBean("CarService");
////    System.out.println(carServiceInterface.getBeanName());
//}
