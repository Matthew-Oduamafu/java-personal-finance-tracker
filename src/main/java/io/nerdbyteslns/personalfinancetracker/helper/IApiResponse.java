package io.nerdbyteslns.personalfinancetracker.helper;

import java.util.List;

public interface IApiResponse<T> {
    String getMessage();
    int getCode();
    T getData();
    List<ErrorResponse> getErrors();
    void setMessage(String message);
}
