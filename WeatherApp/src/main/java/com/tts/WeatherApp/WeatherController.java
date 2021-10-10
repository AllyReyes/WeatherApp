package com.tts.WeatherApp;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Controller
public class WeatherController {
    @Autowired
    private WeatherService weatherService;
    private Object Request;

    @GetMapping
    public String getIndex(Model model) {
        Response response = weatherService.getForecast("28115");
        model.addAttribute("data", response);
        return "index";

//        @PostMapping
//        public String postIndex (Request Object request; request, Model model){
//            Response data = weatherService.getForecast(request.getZipCode());
//            model.addAttribute("data", data);
//            System.out.println("Hello!");
//            return "index";

        }
    }



