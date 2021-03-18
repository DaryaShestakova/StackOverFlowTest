package com.stackexchange.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public abstract class BaseApi {

    protected ObjectMapper objectMapper;
    protected final String BASE_API = "https://api.stackexchange.com/2.2";

    private String site;

    public abstract String buildEndpoint();

    public String baseParameter() {
        return "site=" + site;
    };
}
