package com.projectpractice.food.controller;

import com.projectpractice.food.model.Food;
import com.projectpractice.food.service.FoodService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FoodController {

    private FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping("/home")
    public String getHome(Model model) {
        model.addAttribute("message", "Hello World Im From Food Controller");


        Food[] foods = foodService.getFoods();
        model.addAttribute("foods", foods);

        return "home";
    }

    @GetMapping("/style")
    public String style() {
        return "add-css-js-demo";
    }
}
