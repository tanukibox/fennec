package dev.javierparada.fennec

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FennecApplication

fun main(args: Array<String>) {
	runApplication<FennecApplication>(*args)
}
