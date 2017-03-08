package io.icednut.spock.exercise.service;

import io.icednut.spock.exercise.model.Lyrics;
import io.icednut.spock.exercise.repository.LyricsSearchReposiroty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author wangeun.lee@sk.com
 */
@Service
public class LyricsSearchService {
    @Autowired
    private LyricsSearchReposiroty repository;

    public String getLyrics(String artist, String songName) {
        Lyrics lyrics = Optional.ofNullable(repository.findLyricsByArtistAndSongName(artist, songName)).orElse(new Lyrics());
        return lyrics.getContent();
    }
}
