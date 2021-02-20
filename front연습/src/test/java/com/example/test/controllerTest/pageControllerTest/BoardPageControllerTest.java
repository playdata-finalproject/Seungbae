package com.example.test.controllerTest.pageControllerTest;

import com.example.test.TestApplicationTests;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@AutoConfigureMockMvc
public class BoardPageControllerTest extends TestApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void listPage() throws Exception{
        mockMvc.perform(get("/board"))
                .andExpect(status().isOk())
                .andExpect(view().name("/pages/list"));
    }

    @Test
    public void viewPage() throws Exception{
        mockMvc.perform(get("/board/view"))
                .andExpect(status().isOk())
                .andExpect(view().name("/pages/view"));

    }

}
