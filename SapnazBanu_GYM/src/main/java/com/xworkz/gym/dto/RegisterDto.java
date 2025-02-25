package com.xworkz.gym.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.NamedQuery;

@Data
@NoArgsConstructor
public class RegisterDto {
    private String name;
    private String email;
    private String password;
    private String packages;
    private String trainer;
    private long phone;
    private String gymName;
    private String amount;
    private String discount;
    private int paid;
    private double balance;
    private double installment;
}