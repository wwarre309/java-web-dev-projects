package com.projectpractice.food.service;

import com.projectpractice.food.model.Food;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
    public Food[] getFoods() {
        Food[] foods= {new Food("chicken", 9.9), new Food("bacon", 5.5), new Food("ranch", 3.0)};
        return foods;
    }
}
