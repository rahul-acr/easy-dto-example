package org.easydto.dtotest;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.easydto.jackson.Registerer;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SampleApplication implements InitializingBean {

	@Autowired
	private ObjectMapper mapper;

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

	@Override
	public void afterPropertiesSet() {
		Registerer.registerModules(mapper);
	}
}
