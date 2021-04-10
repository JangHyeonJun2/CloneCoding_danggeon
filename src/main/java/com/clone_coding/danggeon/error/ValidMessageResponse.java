package com.clone_coding.danggeon.error;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ValidMessageResponse {
    private String code;

    private String description;

    private String detail;

    public ValidMessageResponse(String code, String description) {
        this.code = code;
        this.description = description;
     }

    public ValidMessageResponse(String code, String description, String detail) {
        this.code = code;
        this.description = description;
        this.detail = detail;
    }
}
