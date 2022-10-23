package com.example.GMH_Backend_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class GmhBackend1Application {

	public static void main(String[] args) {
		SpringApplication.run(GmhBackend1Application.class, args);
	}

}
