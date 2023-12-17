package com.example.demo.controller;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Trip;
import com.example.demo.repository.TripRepository;

@Controller
public class PageController {
	
	@Autowired
	TripRepository repository;

	@GetMapping({"/","/home","/main"})
	public ModelAndView home() {
		return  new ModelAndView("./pages/home.html");
		
	}
	
	@GetMapping("/contact")
	public ModelAndView contact() {
		return new ModelAndView("./pages/contact.html");
	}
	
	@GetMapping("/about")
	public ModelAndView about() {
		return new ModelAndView("./pages/about.html");
	}
	
	@GetMapping("/trips")
	public ModelAndView trip(@RequestParam(required = false) String category) {
				
		ModelAndView model = new ModelAndView("./pages/trip.html");
		
		List<Trip> hotels = category == null ? repository.findAll():repository.findAllBycategory(category);
		
		Collections.shuffle(hotels);
		
		model.addObject("trips",hotels);
		
		return model;
	}
	
	@GetMapping("/purchase")
	public ModelAndView purchase(@RequestParam Integer id) {
		
		ModelAndView model = new ModelAndView("./pages/purchase.html");
		
		model.addObject("trip",repository.getById(id));
		
		return model;
	}
}
