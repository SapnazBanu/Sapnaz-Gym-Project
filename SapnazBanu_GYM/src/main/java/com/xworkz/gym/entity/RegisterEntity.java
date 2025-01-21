package com.xworkz.gym.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
@Data
@NoArgsConstructor
@Entity
@Table(name="register_table")

@NamedQuery(name="updatedDetailsByName" ,query="update RegisterEntity p set p.trainer = :trainerBy, p.amount = :amountBy, p.balance = :balanceBy where p.packages = :packagesBy")
@NamedQuery(name="updatedDetailsByName" ,query="update RegisterEntity p set p.packages = :packagesBy, p.trainer = :trainerBy, p.amount = :amountBy, p.balance = :balanceBy where p.name = :nameBy")
public class RegisterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private double balance;
        private double installment;

    }


