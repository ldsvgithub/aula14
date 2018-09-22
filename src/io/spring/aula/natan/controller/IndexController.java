package io.spring.aula.natan.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.spring.aula.natan.entity.Usuario;

@RestController
public class IndexController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() {
		return "Endpoint inicial";
	}
	
}
