package com.stitchline.stitchlineApi.advisor

import com.stitchline.stitchlineApi.exception.NotFoundException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice


@RestControllerAdvice
@CrossOrigin
class AppWideExceptionHandler {

    @ExceptionHandler
    fun handleException(e: Exception): ResponseEntity<String> {
        println("exception done $e")
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("$e")
    }

    @ExceptionHandler
    fun handleNotFoundException(e: NotFoundException): ResponseEntity<String> {
        println("exception done $e")
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("$e")
    }

}