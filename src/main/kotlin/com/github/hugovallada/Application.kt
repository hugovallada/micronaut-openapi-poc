package com.github.hugovallada

import io.micronaut.runtime.Micronaut.*
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.info.*


fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.github.hugovallada")
		.deduceEnvironment(false)
		.start()
}

