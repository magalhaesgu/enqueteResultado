package br.com.cielo.microservice.resultado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableFeignClients
@EnableSpringDataWebSupport
public class EnqueteRespostaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnqueteRespostaApplication.class, args);
	}

}
