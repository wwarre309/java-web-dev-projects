package com.projectpractice.practice.service;

import com.projectpractice.practice.model.Food;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
    public Food[] getFoods() {
        Food[] foods ={new Food("bacon", 5.5), new Food("chicken", 9.5), new Food("ranch", 2.0)};
        return foods;
    }
}
