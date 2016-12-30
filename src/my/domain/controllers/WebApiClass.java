package my.domain.controllers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;

import my.domain.models.PersonObject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebApiClass {

	@RequestMapping(value = "/myname/{name}", method = RequestMethod.GET)
	public PersonObject getData( @PathVariable String name, HttpServletRequest req )
	{
		PersonObject person=new PersonObject();
		person.setName(name);
		
		
		return person;
	}
	
	
	
}


