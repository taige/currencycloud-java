package com.currencycloud.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import net.minidev.json.JSONObject;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Currency {

    private String code;
    private Integer decimalPlaces;
    private String name;
    private Boolean onlineTrading;

    public String getCode() {
        return code;
    }

    public Integer getDecimalPlaces() {
        return decimalPlaces;
    }

    public String getName() {
        return name;
    }

    public Boolean getOnlineTrading() {
        return onlineTrading;
    }

    @Override
    public String toString() {
        return new JSONObject()
                .appendField("code", code)
                .appendField("decimalPlaces", decimalPlaces)
                .appendField("name", name)
                .appendField("onlineTrading", onlineTrading)
                .toString();
    }
}
