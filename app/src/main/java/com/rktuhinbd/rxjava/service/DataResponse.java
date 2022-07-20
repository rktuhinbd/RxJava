package com.rktuhinbd.rxjava.service;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DataResponse<T> {

    @NonNull
    public final Status status;

    @Nullable
    public final T data;

    @Nullable
    public final String message;


    public DataResponse(@NonNull Status status, @Nullable T data, @Nullable String message) {
        this.status = status;
        this.data = data;
        this.message = message;
    }

    public static <T> DataResponse<T> success(@Nullable T data) {
        return new DataResponse<>(Status.SUCCESS, data, null);
    }

    public static <T> DataResponse<T> error(@NonNull String msg, @Nullable T data) {
        return new DataResponse<>(Status.ERROR, data, msg);
    }

    public static <T> DataResponse<T> loading(@Nullable T data) {
        return new DataResponse<>(Status.LOADING, data, null);
    }

    public enum Status {SUCCESS, ERROR, LOADING}

    public enum Error {NO_INTERNET, UNAUTHENTICATED, LOADING}

}
