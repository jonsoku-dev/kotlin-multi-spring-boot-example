package com.tamastudy.ta.api

import com.tamastudy.ta.common.config.CommonConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import

@SpringBootApplication(scanBasePackages = [
    "com.tamastudy.ta.common.*",
    "com.tamastudy.ta.api"
])
@Import(CommonConfiguration::class)
class TaApiApplication
fun main(args: Array<String>) {
    runApplication<TaApiApplication>(*args)
}
