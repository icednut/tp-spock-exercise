package io.icednut.spock.exercise.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author wangeun.lee@sk.com
 * @since 15. 8. 4.
 */
@Entity
public class Lyrics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lyricsId;
    private String artist;
    private String songName;
    private String content;

    public Long getLyricsId() {
        return lyricsId;
    }

    public void setLyricsId(Long lyricsId) {
        this.lyricsId = lyricsId;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}