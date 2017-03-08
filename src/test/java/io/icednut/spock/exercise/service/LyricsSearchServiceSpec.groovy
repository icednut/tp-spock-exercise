package io.icednut.spock.exercise.service

import io.icednut.spock.exercise.repository.LyricsSearchReposiroty
import spock.lang.Specification

/**
 * @author icednut
 */
class LyricsSearchServiceSpec extends Specification {
    def service = new LyricsSearchService()

    def "가수명, 노래제목을 입력하면 그에 해당하는 노래가사를 받아야 한다."() {
        given:
        def artist = "dummyAritst"
        def songName = "dummySongName"
        def givenLyrics = "dummyLyrics"

        service.repository = Mock(LyricsSearchReposiroty.class)
        service.repository.findLyricsByArtistAndSongName(artist, songName) >> givenLyrics

        when:
        def actualLyrics = service.getLyrics(artist, songName)

        then:
        actualLyrics == givenLyrics
    }
}
