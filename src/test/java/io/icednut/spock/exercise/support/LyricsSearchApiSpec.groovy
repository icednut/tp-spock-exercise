package io.icednut.spock.exercise.support

import io.icednut.spock.exercise.SpockExerciseApplication
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.http.MediaType
import org.springframework.test.context.web.WebAppConfiguration
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.context.WebApplicationContext
import spock.lang.Specification

/**
 * @author icednut
 */
@SpringApplicationConfiguration(classes = SpockExerciseApplication.class)
@WebAppConfiguration
class LyricsSearchApiSpec extends Specification {
    def mockMvc;

    @Autowired
    WebApplicationContext context;

    void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build()
    }

    def "가사 조회 API를 Call하면 가사를 얻을 수 있어야 한다."() {
        given:
        def artist = "dummyArtist"
        def songName = "dummySongName"

        when:
        def result = mockMvc.perform(MockMvcRequestBuilders.get("/lyrics?artist=${artist}&songName=${songName}")
                .contentType(MediaType.APPLICATION_JSON))

        then:
        result != null
        result.andReturn()
                .getResponse()
                .getContentAsString()
                .contains("lyrics")
    }
}
