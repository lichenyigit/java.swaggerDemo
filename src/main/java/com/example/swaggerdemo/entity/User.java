package com.example.swaggerdemo.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.models.annotations.OpenAPI31;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "User" ,description = "用户")
public class User {
    @Schema(name = "userName",description = "姓名")
    private String userName;
    @Schema(name = "age",description = "年龄")
    private String age;
}
