package spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import controllers.HelloController;

//@Configuration
//public class ControllerConfig {
//	
//	@Bean
//	public HelloController helloController() {
//		return new HelloController();
//	}
//}

@Configuration
@ComponentScan("controllers")	// controllers안의 모든 파일들을 빈 객체로 등록
public class ControllerConfig {
	
}
