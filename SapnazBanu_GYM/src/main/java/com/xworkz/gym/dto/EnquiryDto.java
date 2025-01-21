package com.xworkz.gym.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EnquiryDto {

    private String name;
    private String area;
    private long phone;
    private int distance;
    private int age;

}
