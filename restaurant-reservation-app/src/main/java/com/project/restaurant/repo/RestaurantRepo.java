package com.project.restaurant.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.restaurant.entity.Restaurant;

public interface RestaurantRepo extends JpaRepository<Restaurant, Integer> {

}
