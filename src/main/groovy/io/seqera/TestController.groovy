package io.seqera

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/foo")
class TestController {
    @Get
    String hello(){
        return "Hello World"
    }
}
