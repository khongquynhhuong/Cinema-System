package com.example.HDQCinema.exception;

import lombok.AccessLevel;
import lombok.Getter;

import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public enum ErrorCode {
    USER_NOT_FOUND(2001, "user not found", HttpStatus.NOT_FOUND),
    UNAUTHENTICATED(8001, "unauthenticated user", HttpStatus.UNAUTHORIZED),
    ;


    int code = 1000;
    String message;
    HttpStatusCode statusCode;

    ErrorCode(int code, String message, HttpStatusCode statusCode) {
        this.code = code;
        this.message = message;
        this.statusCode = statusCode;
    }

}
