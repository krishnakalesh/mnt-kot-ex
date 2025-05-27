package com.demo

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus

@Controller("/mnt")
class RestDemoAppController {

    @Get(uri="/ping", produces=["text/plain"])
    fun ping(): String {
        return "pong"
    }
}