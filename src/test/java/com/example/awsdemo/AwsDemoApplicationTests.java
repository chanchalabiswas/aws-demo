package com.example.awsdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
class AwsDemoApplicationTests {
	
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void displayMessageReturnsOk() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/awsdemo/display")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();
    }
    @Test
    public void displayMessageStringCheck() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/awsdemo/display")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello world"));
    }

}
