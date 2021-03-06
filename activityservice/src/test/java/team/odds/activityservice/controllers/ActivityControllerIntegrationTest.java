package team.odds.activityservice.controllers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import team.odds.activityservice.services.ActivityService;

import java.util.Collections;

@WebMvcTest
@ExtendWith(SpringExtension.class)
public class ActivityControllerIntegrationTest {
    @MockBean
    ActivityService activityService;

    @Autowired
    MockMvc mockMvc;

    @Test
    void testGetActivityShouldReturnActivityList() throws Exception {
        Mockito.when(activityService.getAll()).thenReturn(Collections.emptyList());

        ResultActions actual = mockMvc.perform(MockMvcRequestBuilders.get("/activities"));
        actual.andExpect(MockMvcResultMatchers.status().isOk());
        actual.andExpect(MockMvcResultMatchers.content().string("[]"));
    }
}
