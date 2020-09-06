package me.jeongmin.demospringmvc;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    public List<Event> getEvents() {
        Event event = Event.builder().build();
    }
}
