package io.seqera

import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpStatus
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.http.client.exceptions.HttpClientResponseException
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.Specification

@MicronautTest
class TestControllerTest extends Specification {
    @Inject
    @Client("/")
    HttpClient client

    def 'test hello'() {
        when:
        def request = HttpRequest.POST('/foo', '')
                .contentType("application/x-www-form-urlencoded")
        def response = client.toBlocking().exchange(request, String)

        then:
        def e = thrown(HttpClientResponseException)
        e.status.code == 405
    }
}
