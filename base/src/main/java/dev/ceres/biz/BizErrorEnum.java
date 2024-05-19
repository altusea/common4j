package dev.ceres.biz;

public enum BizErrorEnum {

    SUCCESS("0000", "OK!"),

    PARAM_ILLEGAL("1001", "param illegal!"),
    ;

    private final String code;

    private final String desc;

    BizErrorEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
