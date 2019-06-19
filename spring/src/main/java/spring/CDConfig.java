package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@ComponentScan(basePackages = "package spring")
public class CDConfig {

    @Bean
    public CDPlayer cdimp(){

        return new CDPlayerImpl();
    }

    @Bean
    public CompicDis comd(){

        return new CompicDisImpl();
    }

}
