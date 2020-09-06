package me.jeongmin.demospringmvc;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventController {

    @GetMapping("/events")
    public String events(Model model) {
        return "events";
    }
}
