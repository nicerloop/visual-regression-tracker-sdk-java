package io.visual_regression_tracker.sdk_java.request;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Getter
@Builder
public class BuildRequest {
    private final String project;
    private final String branchName;
}
