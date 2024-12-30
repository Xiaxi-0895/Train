package com.xiaxi.common.error;


public class TrainException extends RuntimeException {
    private final int code;
    private final String msg;
    public TrainException(final int code, final String msg) {
        this.code = code;
        this.msg = msg;
    }
    public TrainException(TrainExceptionEnum exceptionEnum) {
        this(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
