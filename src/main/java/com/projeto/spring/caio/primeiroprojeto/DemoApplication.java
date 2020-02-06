package com.projeto.spring.caio.primeiroprojeto;

import com.projeto.serviceEmpresa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
	@Value("${pagination.qtd.page}")//usa essa propertie in application.properties
	private int qtdPage;

	@Autowired
	private serviceEmpresa eServiceEmpresa;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean // preciso do bean para injetar a dependencia
	public CommandLineRunner commandLineRunner() {
		return args -> {
			eServiceEmpresa.testarService();
			System.out.println("### QUANTIDADE DE PAGINAS  =" +  this.qtdPage);
		};
	}
	
}
