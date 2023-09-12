package org.launchcode.skillstracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


    @Controller
    public class SkillsController {
        @RequestMapping(value="")
        @ResponseBody
        public String skillsTracker(){

            return "<h1> Skills Tracker </h1>" +
                                    "<h2> Here's a list of a few skills you can learn</h2>" +
                                       "<ol>" +
                                            "<li> Java </li>" +
                                            "<li> C++</li>" +
                                            "<li> Python </li>" +
                                        "</ol>";
        }

        @GetMapping(value="form")
        @ResponseBody
        public String userInput () {
            return "<form method='post'> " +
                        "Name: <br>" +
                            "<input type= 'text' name = 'name' /> " +
                    "<br> My First Choice: <br>" +
                        "<select name = 'firstChoice'>" +
                            "<option value = 'Java'> Java</option> +" +
                            "<option value = 'C++'> C++ </option> +" +
                            "<option value = 'Python'> Python</option> +" +
                        "</select>" +
                    "<br> My Second Choice: <br>" +
                        "<select name = 'secondChoice'> " +
                            "<option value = 'Java'> Java</option>" +
                            "<option value = 'C++'> C++ </option> " +
                            "<option value = 'Python'> Python</option>" +
                        "</select>" +
                    "<br> My Last Choice: <br>" +
                        "<select name = 'lastChoice'>" +
                            "<option value = 'Java'> Java</option> " +
                            "<option value = 'C++'> C++ </option> " +
                            "<option value = 'Python'> Python </option> " +
                        "</select><br>" +
                    "<input type = 'submit' value = 'Submit'/>" +
                    "</form>";
        }

        @PostMapping(value="form")
        @ResponseBody
        public String namePage(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String lastChoice) {
            return      "<h1 style ='color: red'>" + name +"</h1>" +
                    "<table border = 1>" +
                    "<tr><th>First Choice</th><td>" + firstChoice + "</td></tr>" +
                    "<tr><th>Second Choice</th><td>" + secondChoice + "</td></tr>" +
                    "<tr><th>Last Choice</th><td>" + lastChoice + "</td></tr>" +
                    "</table>";
        }

    }

