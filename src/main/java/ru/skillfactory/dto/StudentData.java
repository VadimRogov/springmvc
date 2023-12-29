package ru.skillfactory.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.io.Serializable;

@Data
public class StudentData implements Serializable {

    @JsonProperty("firstName")
    @ApiModelProperty(value = "Имя студента")
    private String firstName;

    @JsonProperty("lastName")
    @ApiModelProperty(value = "Фамилия студента")
    private String lastName;

    @JsonProperty("grade")
    @ApiModelProperty(value = "Оценка студента")
    private int grade;
}


