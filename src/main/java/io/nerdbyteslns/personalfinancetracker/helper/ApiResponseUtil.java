package io.nerdbyteslns.personalfinancetracker.helper;

import org.springframework.http.HttpStatus;

import java.util.List;

public class ApiResponseUtil {


    public static <T> ApiResponse<T> toOkApiResponse(T data) {
        return toApiResponse(data, DefaultHttpMessage.ERROR.getMessage(), HttpStatus.OK.value(), null);
    }

    public static <T> ApiResponse<T> toCreatedApiResponse(T data) {
        return toApiResponse(data, DefaultHttpMessage.CREATED.getMessage(), HttpStatus.CREATED.value(), null);
    }

    public static <T> ApiResponse<T> toAcceptedApiResponse(T data) {
        return toApiResponse(data, DefaultHttpMessage.ACCEPTED.getMessage(), HttpStatus.ACCEPTED.value(), null);
    }

    public static <T> ApiResponse<T> toNotFoundApiResponse(T data) {
        return toApiResponse(data, DefaultHttpMessage.NOT_FOUND.getMessage(), HttpStatus.NOT_FOUND.value(), null);
    }

    public static <T> ApiResponse<T> toFailedDependencyApiResponse(T data, List<ErrorResponse> errors) {
        return toApiResponse(data, DefaultHttpMessage.FAILED_DEPENDENCY.getMessage(), HttpStatus.FAILED_DEPENDENCY.value(), errors);
    }

    public static <T> ApiResponse<T> toUnAthorizedApiResponse(T data) {
        return toApiResponse(data, DefaultHttpMessage.UNAUTHORIZED.getMessage(), HttpStatus.UNAUTHORIZED.value(), null);
    }

    public static <T> ApiResponse<T> toInternalServerErrorApiResponse(T data, List<ErrorResponse> errors) {
        return toApiResponse(data, DefaultHttpMessage.INTERNAL_SERVER_ERROR.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value(), errors);
    }

    public static <T> ApiResponse<T> toBadRequestApiResponse(T data, List<ErrorResponse> errors) {
        return toApiResponse(data, DefaultHttpMessage.BAD_REQUEST.getMessage(), HttpStatus.BAD_REQUEST.value(), errors);
    }

    private static <T> ApiResponse<T> toApiResponse(T data, String message, int code, List<ErrorResponse> errors) {
        return new ApiResponse<>(message, code, data, errors);
    }
}