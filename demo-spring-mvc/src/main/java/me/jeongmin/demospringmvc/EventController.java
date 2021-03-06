package me.jeongmin.demospringmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventController {

    @Autowired
    EventService eventService; // 생성자로 받아도 됨

    @GetMapping("/events")
    public String events(Model model) {
        model.addAttribute("events", eventService.getEvents());
        return "events";
    }
}
