package spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import controllers.HelloController;

@Configuration
@ComponentScan("controllers")
public class ControllerConfig {

}
