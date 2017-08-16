package com.marriageonmind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.context.request.RequestContextListener;


//@SpringBootApplication(scanBasePackages={"com.marriageonmind","com.marriageonmind.config","com.marriageonmind.model","com.marriageonmind.repository","com.marriageonmind.persistence.model"})

@SpringBootApplication
//@EnableJpaRepositories(basePackages ={ "com.marriageonmind.persistence.dao"})
//@EntityScan(basePackages ={ "com.marriageonmind.model","com.marriageonmind.persistence.model"})

public class SpringBootNSpringDataJpaOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootNSpringDataJpaOneApplication.class, args);
	}
	@Bean
    public RequestContextListener requestContextListener() {
        return new RequestContextListener();
    }
	
}
