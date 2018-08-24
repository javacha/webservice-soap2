package com.opencodez;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({ "classpath:webservice-definition-beans.xml" })
public class WebserviceSoap2Application {
	public static void main(String[] args) {
		SpringApplication.run(WebserviceSoap2Application.class, args);
	}
}
