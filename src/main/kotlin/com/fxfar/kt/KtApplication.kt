package com.fxfar.kt

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class KtApplication

fun main(args: Array<String>) {
    SpringApplication.run(KtApplication::class.java, *args)
}
