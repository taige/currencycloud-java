package com.currencycloud.client.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.List;

@EqualsAndHashCode(callSuper = false)
@Getter
public class Settlements extends PaginatedData {

    private List<Settlement> settlements;

    @Override
    public String toString() {
        return String.format("{\"settlements\":%s, \"pagination\":%s}", settlements, pagination);
    }
}
