package team.odds.activityservice.controllers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest
@ExtendWith(SpringExtension.class)
public class ActivityControllerIntegrationTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    void testGetActivityShouldReturnActivityList() throws Exception {
        ResultActions actual = mockMvc.perform(MockMvcRequestBuilders.get("/activities"));
        actual.andExpect(MockMvcResultMatchers.status().isOk());
        actual.andExpect(MockMvcResultMatchers.content().string("[{\"id\":1,\"name\":\"Login\",\"description\":\"Kan is logged in\"},{\"id\":2,\"name\":\"Logout\",\"description\":\"Kan is logged out\"}]"));
    }
}
