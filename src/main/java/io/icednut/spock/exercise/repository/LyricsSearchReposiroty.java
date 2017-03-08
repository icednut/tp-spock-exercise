package io.icednut.spock.exercise.repository;

import io.icednut.spock.exercise.model.Lyrics;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wangeun.lee@sk.com
 */
public interface LyricsSearchReposiroty extends JpaRepository<Lyrics, Long> {
    Lyrics findLyricsByArtistAndSongName(String artist, String songName);
}
