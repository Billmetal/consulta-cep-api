package br.com.homework.bill.cepapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot 
 * 
 * módulos selecionados :
 * - Spring Web
 * - Spring Data Jpa
 * - H2 Database
 * - OpenFeing
 * 
 * @author Willian K.
 * 
 * **/

@EnableFeignClients
@SpringBootApplication
public class CepApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CepApiApplication.class, args);
	}

}
