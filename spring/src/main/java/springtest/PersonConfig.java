package springtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Configuration
//@ImportResource("classpath*:resources/cartest.xml")
public class PersonConfig {

    @Bean
    public IPerson iPerson(Car car){
        return  new IPersonImpl(car);
    }
}
