package com.andes.intellij.model;

import lombok.Data;

@Data
public class Return_DB_Json_Model {
    // [현재 date 확인]
    private String state;
    private String message;

    public Return_DB_Json_Model(String state, String message) {
        this.state = state;
        this.message = message;
    }
}
