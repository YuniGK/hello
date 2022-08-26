package com.example.hello.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
public class CarDto {
    private String name;
    private String carNumber;
}
