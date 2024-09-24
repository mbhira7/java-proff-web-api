package org.example.checkpoint;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class CheckpointApplicationTests {
    @Autowired
    MockMvc mockMvc;

    @Test
    void contextLoads() {
    }

    @Test
    void showCompanies() throws Exception {
        mockMvc.perform(get("/search")
                .param("query", "a"))
                .andExpect(status().is(200))
                .andExpect(view().name("results"));
    }

    @Test
    void showCompanyById() throws Exception {
        mockMvc.perform(get("/details/{id}", "IF8ZJH410KR"))
                .andExpect(status().is(200))
                .andExpect(view().name("details"));
    }
}
