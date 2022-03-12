package kz.iitu.itse1901.muratbekuly.configuration;


import kz.iitu.itse1901.muratbekuly.service.UserServices.UserServiceInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Configuration
//public class UserConfiguration {
//    @Bean(value = "${config_bean}")
//    @Scope("singleton")
//    public UserServiceInterface service(){
//        return new UserService();
//    }
//
//    @PostConstruct
//    public void init(){
//        System.out.println("User init method called...");
//    }
//
//    @PreDestroy
//    public void destroy(){
//        System.out.println("User destroy method called...");
//    }
//}
