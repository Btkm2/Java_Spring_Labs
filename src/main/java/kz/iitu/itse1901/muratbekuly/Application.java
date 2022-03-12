package kz.iitu.itse1901.muratbekuly;

import kz.iitu.itse1901.muratbekuly.database.User;
import kz.iitu.itse1901.muratbekuly.service.CarServices.CarServiceInterface;
import kz.iitu.itse1901.muratbekuly.service.UserServices.UserServiceInterface;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@SpringBootApplication
//@Configuration
//@ComponentScan
//@EnableAutoConfiguration
@EnableAspectJAutoProxy
public class Application {


//	@Value("${test_bean}")
//	private String test_bean;


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
//		Application app = applicationContext.getBean(Application.class);
//		System.out.println(app.test_bean);
//		CarServiceInterface carServiceInterface = (CarServiceInterface) applicationContext.getBean("CarService");
//		CarServiceInterface carServiceInterface2 = (CarServiceInterface) applicationContext.getBean("CarService");
//		System.out.println(carServiceInterface);
//		System.out.println(carServiceInterface2);
////		CarConfiguration carConfiguration = (CarConfiguration) applicationContext.getBean("");
////		System.out.println(carConfiguration.);
//		UserServiceInterface userServiceInterface = (UserServiceInterface) applicationContext.getBean("${config_bean}");
//		UserServiceInterface userServiceInterface2 = (UserServiceInterface) applicationContext.getBean("${config_bean}");
//		System.out.println(userServiceInterface);
//		System.out.println(userServiceInterface2);
//		applicationContext.getBean("carService", CarServiceInterface.class).getALlCars();
	}

}
