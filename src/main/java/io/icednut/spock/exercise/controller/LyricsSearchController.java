package io.icednut.spock.exercise.controller;

import io.icednut.spock.exercise.model.LyricsResponse;
import io.icednut.spock.exercise.service.LyricsSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author icednut
 */
@RestController
public class LyricsSearchController {
    @Autowired
    private LyricsSearchService service;

    @RequestMapping(value = "/lyrics")
    public LyricsResponse getLyrics(String artist, String songName) {
        return new LyricsResponse(service.getLyrics(artist, songName));
    }
}
