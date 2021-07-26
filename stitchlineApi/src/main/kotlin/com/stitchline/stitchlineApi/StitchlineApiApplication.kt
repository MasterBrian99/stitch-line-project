package com.stitchline.stitchlineApi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.CrossOrigin

@SpringBootApplication
@CrossOrigin
class StitchlineApiApplication
fun main(args: Array<String>) {
	println("hello")
	runApplication<StitchlineApiApplication>(*args)
}
