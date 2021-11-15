package com.github.hugovallada

import io.micronaut.runtime.Micronaut.*
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.info.*

@OpenAPIDefinition(
    info = Info(
            title = "Swagger/Open API POC",
            version = "1.0",
            description = "Proof of Concept about the use of Micronaut + Kotlin with OpenAPI",
            license = License(name = "Apache 2.0"),
            contact = Contact(name = "Hugo Vallada", url = "http://github.com/hugovallada", email = "valladahugo@gmail.com")
    )
)
object Api {}

fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.github.hugovallada")
		.start()
}

