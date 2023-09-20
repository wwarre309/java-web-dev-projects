package com.projectpractice.practice.controller;


import com.projectpractice.practice.model.Food;
import com.projectpractice.practice.service.FoodService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FoodController {
    private FoodService foodService;
    public FoodController(FoodService foodService){
        this.foodService = foodService;
    }
    @GetMapping("/home")
    public String getHome(Model model) {
        model.addAttribute("message", "Hello World Im from food controller");
        Food[] foods = foodService.getFoods();
        model.addAttribute("foods", foods);

        return "home";
    }
}
