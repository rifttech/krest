package com.github.rifttech.krest

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class KrestApplication

fun main(args: Array<String>) {
    SpringApplication.run(KrestApplication::class.java, *args)
}
