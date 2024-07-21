package io.nerdbyteslns.personalfinancetracker.helper;

import java.util.List;

public class ApiResponse<T> implements IApiResponse<T> {
    private String message;
    private final int code;
    private final T data;
    private final List<ErrorResponse> errors;

    public ApiResponse(String message, int code, T data, List<ErrorResponse> errors) {
        this.message = message;
        this.code = code;
        this.data = data;
        this.errors = errors;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public T getData() {
        return data;
    }

    @Override
    public List<ErrorResponse> getErrors() {
        return errors;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }
}