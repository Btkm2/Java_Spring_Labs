package kz.iitu.itse1901.muratbekuly.JMS;

import kz.iitu.itse1901.muratbekuly.database.Car;
import lombok.val;
import org.springframework.context.annotation.*;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;

import java.util.Collections;

@Configuration
public class JMSConfig {
    @Bean
    public MappingJackson2MessageConverter messageConverter() {
        val messageConveror = new MappingJackson2MessageConverter();
        messageConveror.setTypeIdPropertyName("context-type");
        messageConveror.setTypeIdMappings(Collections.singletonMap("car", Car.class));
        return messageConveror;
    }
}
