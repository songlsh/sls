package springtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {

    @Bean("cardd")
    public Car car(){

        return new CarImpl();
    }
}
