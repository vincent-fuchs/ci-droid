package com.societegenerale.cidroid.model.gitlab;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.societegenerale.cidroid.model.github.Repository;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GitLabPushEvent implements GitLabEvent{

    @JsonProperty("ref")
    private String ref;

    private GitLabProject project;

    private GitLabRepository repository;
}
