package com.test.util;

import java.util.Objects;

public enum SexEnum {
    unknown(0, ""),
    male(1, "男"),
    female(2, "女");

    private final Integer code;
    private final String desc;
    SexEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static SexEnum getType(int code) {
        for (SexEnum status : SexEnum.values()) {
            if (Objects.equals(status.getCode(), code)) {
                return status;
            }
        }
        return null;
    }
    public Integer getCode() {
        return code;
    }
    public String getName() {
        return desc;
    }
}
