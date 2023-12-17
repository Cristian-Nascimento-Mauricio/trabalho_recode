package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Trip;

public interface TripRepository extends JpaRepository<Trip, Integer> {
	
	List<Trip> findAllBycategory(String category);
	
	Trip getById(Integer id);
	
	
}
