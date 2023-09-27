package com.faculdade.buspointbackend.exceptions;

public class AppException extends RuntimeException{

    private AppError error;

    private AppException(AppError error) {
        this.error = error;
    }

    public static AppException of(AppError appError){
        return new AppException(appError);
    }

    public AppError getError() {
        return error;
    }
}
