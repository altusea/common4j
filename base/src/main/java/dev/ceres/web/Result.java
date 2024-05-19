package dev.ceres.web;

import dev.ceres.biz.BizErrorEnum;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Result<T> {

    private String code;

    private String message;

    private T data;

    public Result() {
    }

    public Result(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> Result<T> ok(@Nullable T data) {
        return new Result<>(BizErrorEnum.SUCCESS.getCode(), BizErrorEnum.SUCCESS.getDesc(), data);
    }

    public static Result<Void> fail(@NotNull BizErrorEnum bizErrorEnum) {
        return new Result<>(bizErrorEnum.getCode(), bizErrorEnum.getDesc(), null);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
