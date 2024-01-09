package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {
    //Handles localhost:8080/home
    @GetMapping("home")
    public String homePage(){
        return "<html>" +
                "<body>" +
                "<h1> Skills Tracker </h1>" +
                "<h2> We have a few skills we would like to learn.Here is the list!" +
                "<ol>" +
                "<li> Java </li>" +
                "<li> JavaScript </li>" +
                "<li> Python </li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
    //handles localhost:8080/home/form
    @GetMapping("form")
    public String displayPage() {
        return "<html>" +
                "<body>" +
                "<form action='form' method='POST'>" +
                "<label>Name</label>" +
                "<input type='text' name='name' /><br/>" +
                "<label> My Favorite Language </label>" +
                "<select name = 'fav1'>" +
                "<option value='Java'> Java </option>" +
                "<option value='JavaScript'> JavaScript </option>" +
                "<option value='Python'> Python </option>" +
                "</select><br/>" +
                "<label> My Second Favorite Language </label>" +
                "<select name = 'fav2'>" +
                "<option value='Java'> Java </option>" +
                "<option value='JavaScript'> JavaScript </option>" +
                "<option value='Python'> Python </option>" +
                "</select><br/>" +
                "<label> My Third Favorite Language </label>" +
                "<select name = 'fav3'>" +
                "<option value='Java'> Java </option>" +
                "<option value='JavaScript'> JavaScript </option>" +
                "<option value='Python'> Python </option>" +
                "</select><br/>" +
                "<input type = 'submit' value = 'submit' />" +
                "</form>" +
                "</body>" +
                "</html>";
    }
    //handles localhost:8080/home/form postmapping
    @PostMapping("form")
    public String namePage(@RequestParam String name, @RequestParam String fav1, @RequestParam String fav2, @RequestParam String fav3) {
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>" + name + "</h1>" +
                        "<ol>" +
                        "<li>" + fav1 + "</li>" +
                        "<li>" + fav2 + "</li>" +
                        "<li>" + fav3 + "</li>" +
                        "</ol>" +
                        "</body>"+
                        "</html>";
        return html;
    }
}
