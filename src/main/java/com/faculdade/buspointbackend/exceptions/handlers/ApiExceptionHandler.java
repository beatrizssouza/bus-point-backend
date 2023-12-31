package com.faculdade.buspointbackend.exceptions.handlers;


import com.faculdade.buspointbackend.exceptions.AppError;
import com.faculdade.buspointbackend.exceptions.AppException;
import com.faculdade.buspointbackend.exceptions.dtos.ErrorResponseBase;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Locale;

@ControllerAdvice
public class ApiExceptionHandler {

    private final MessageSource messageSource;

    public ApiExceptionHandler(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @ExceptionHandler(AppException.class)
    public ResponseEntity handleAppException(AppException appException){
        AppError error = appException.getError();
        return ResponseEntity.status(error.getStatus())
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .body(new ErrorResponseBase(error.getCode(), getMessage(error.getMessage())));
    }

    private String getMessage(String key){
        return messageSource.getMessage(key, null, Locale.ENGLISH);
    }
}

