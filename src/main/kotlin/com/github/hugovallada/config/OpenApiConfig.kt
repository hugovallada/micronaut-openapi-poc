package com.github.hugovallada.config

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Contact
import io.swagger.v3.oas.annotations.info.Info
import io.swagger.v3.oas.annotations.info.License

@OpenAPIDefinition(
    info = Info(
        title = "Swagger/Open API POC",
        version = "1.1",
        description = "Proof of Concept about the use of Micronaut + Kotlin with OpenAPI",
        license = License(name = "Apache 2.0"),
        contact = Contact(name = "Hugo Vallada", url = "http://github.com/hugovallada", email = "valladahugo@gmail.com")
    )
)
class OpenApiConfig {
}