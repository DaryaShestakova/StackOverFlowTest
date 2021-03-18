package com.stackexchange.api;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class AnswersApi extends BaseApi {

    private final String RESOURCE = "answers";
    private int page;
    private int pageSize;
    private String order;
    private String sort;
    private String filter;

    public String answerParameters() {
        return "&page=" + page +
                "&pageSize=" + pageSize +
                "&order=" + order +
                "&sort=" + sort +
                "&filter=" + filter;
    };

    public String buildEndpoint() {
        return BASE_API +
                "/" +
                RESOURCE +
                "?" +
                baseParameter() +
                answerParameters();
    }
}
