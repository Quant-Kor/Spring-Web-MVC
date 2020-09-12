package me.jeongmin.demobootweb;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
class SampleControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void hello() {
        this.mockMvc.perform(get("/hello"))
    }
}