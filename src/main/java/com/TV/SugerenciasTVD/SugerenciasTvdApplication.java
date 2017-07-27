package com.TV.SugerenciasTVD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class SugerenciasTvdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SugerenciasTvdApplication.class, args);
	}

	@GetMapping("/")
	public String index(){
		return "El kycha me la pela";
	}

}
