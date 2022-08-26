package com.example.hello.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

//JsonProperty 는 하나의 클래스마다 지정이 가능하며 특정이름으로 설정할 수 있다.
//JsonNaming 은 지정하면 전체가 변경되며 이름은 카멜형식의 표기법에서 스네이크 표기법으로 변경된다.
@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
public class PutRequestDto {
    private String name;
    private int age;
    private List<CarDto> carList;
}
