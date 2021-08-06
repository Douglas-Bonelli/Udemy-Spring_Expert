package br.com.spring.udemy.expert.aula.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Ping")
@CrossOrigin( origins = "*")
public class PingController {
	
	@GetMapping
    public String getPing(){
    	return "OK";
    }

}
