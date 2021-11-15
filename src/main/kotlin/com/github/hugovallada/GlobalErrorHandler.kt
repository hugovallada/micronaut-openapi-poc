package com.github.hugovallada

import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Error
import io.micronaut.http.annotation.Status

@Controller
class GlobalErrorHandler {


    @Error(exception = Exception::class, global = true)
    @Status(HttpStatus.BAD_REQUEST)
    fun internalError(ex: Exception): ErrorResponse {
        return ErrorResponse(ex.message ?: "Error", "500")
    }

}