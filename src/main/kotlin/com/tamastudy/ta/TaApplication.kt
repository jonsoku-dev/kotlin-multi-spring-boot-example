package com.tamastudy.ta

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TaApplication

fun main(args: Array<String>) {
    runApplication<TaApplication>(*args)
}
