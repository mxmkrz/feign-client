package com.client.feignclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FeignClientApplication

fun main(args: Array<String>) {
	runApplication<FeignClientApplication>(*args)
}
