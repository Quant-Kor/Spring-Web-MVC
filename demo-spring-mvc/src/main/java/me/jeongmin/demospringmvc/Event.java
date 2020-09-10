package me.jeongmin.demospringmvc;

import lombok.*;

import java.time.LocalDateTime;


@Getter @Setter
@Builder @NoArgsConstructor @AllArgsConstructor
public class Event {

    public String name;

    private int limitOfEnrollemnt;

    private LocalDateTime startDateTime;

    private LocalDateTime endDateTime;
}
