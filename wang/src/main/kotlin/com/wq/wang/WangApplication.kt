package com.wq.wang

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WangApplication

fun main(args: Array<String>) {
	runApplication<WangApplication>(*args)
}
