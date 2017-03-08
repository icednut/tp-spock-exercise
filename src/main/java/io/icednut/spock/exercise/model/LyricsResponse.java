package io.icednut.spock.exercise.model;

/**
 * @author icednut
 */
public class LyricsResponse {
    private String lyrics;

    public LyricsResponse() {
    }

    public LyricsResponse(String lyrics) {
        this.lyrics = lyrics;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }
}
