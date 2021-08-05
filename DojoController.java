package com.oscar.routingpractice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("{dojo}")
public class DojoController {
	@RequestMapping("")
	public String dojo(@PathVariable("dojo") String dojo) {
		if(dojo.equals("dojo")) {
			return "The dojo is awesome!";
		}
		if(dojo.equals("burbank-dojo")) {
			return "Bubank Dojo is located in Southern California";
		}
		if(dojo.equals("san-jose")) {
			return "SJ dojo is the headquarters";
		}
		
		return "not a dojo location";
	}
}
