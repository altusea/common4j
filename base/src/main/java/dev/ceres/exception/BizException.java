package dev.ceres.exception;

import dev.ceres.biz.BizErrorEnum;

public class BizException extends RuntimeException {

    private String code;

    public BizException(BizErrorEnum bizErrorEnum) {
        super(bizErrorEnum.getDesc());
        this.code = bizErrorEnum.getCode();
    }

    public String getCode() {
        return code;
    }
}
