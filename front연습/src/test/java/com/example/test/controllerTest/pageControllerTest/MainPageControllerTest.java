package com.example.test.controllerTest.pageControllerTest;


import com.example.test.TestApplicationTests;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@AutoConfigureMockMvc
public class MainPageControllerTest extends TestApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void mainpage() throws Exception{
        mockMvc.perform(get("/main"))
                .andExpect(status().isOk())
                .andExpect(view().name("/pages/index"));
    }

}