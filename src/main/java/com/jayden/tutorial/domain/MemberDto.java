package com.jayden.tutorial.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;

public class MemberDto {

    @Getter
    public static class CreateMemberRequest {

        @ApiModelProperty(name = "이름", value = "이름", example = "Jayden", required = true)
        private String name;

        public CreateMemberRequest() {

        }
    }

    @Getter
    public static class CreateMemberResponse {

        @ApiModelProperty(name = "이름", value = "이름",  example = "Jayden", required = true)
        private String name;

        public CreateMemberResponse() {

        }

        @Builder
        public CreateMemberResponse(String name) {
            this.name = name;
        }
    }

}
