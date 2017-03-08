package io.icednut.spock.exercise.controller

import io.icednut.spock.exercise.service.LyricsSearchService
import spock.lang.Specification

/**
 * @author icednut
 */
class LyricsSearchControllerSpec extends Specification {
    def controller = new LyricsSearchController()

    def "가수명, 노래제목을 입력하면 그에 해당하는 노래가사를 받아야 한다."() {
        given:
        def artist = "dummyArtist"
        def songName = "dummySongName"
        def givenLyrics = "dummyLyrics"

        controller.service = Mock(LyricsSearchService)
        controller.service.getLyrics(artist, songName) >> givenLyrics

        when:
        def response = controller.getLyrics(artist, songName)

        then:
        response.lyrics == givenLyrics
    }
}
