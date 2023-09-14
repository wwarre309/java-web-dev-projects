package org.launchcode.codingevents.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {
    @GetMapping
    public String showAllEvents(Model model){
        List<String> events = new ArrayList<>();
        events.add("Pep Rally");
        events.add("Parade");
        events.add("Pool Party");
        events.add("Picnic");
        model.addAttribute("events", events);

        return "events/index";

    }
    @GetMapping("create")
    public String renderCreateEventForm() {
        return "events/create";
    }
}
