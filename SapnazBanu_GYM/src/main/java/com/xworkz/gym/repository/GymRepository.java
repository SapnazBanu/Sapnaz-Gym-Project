package com.xworkz.gym.repository;

import com.xworkz.gym.dto.RegisterDto;
import com.xworkz.gym.entity.EnquiryEntity;
import com.xworkz.gym.entity.RegisterEntity;

import java.util.List;

public interface GymRepository {

    boolean getNameByEmail(String email, String password); //admin login
    boolean saveEnquiry(EnquiryEntity enquiryEntity);     //for enquiry form

    List<EnquiryEntity> findAll();
    List<EnquiryEntity> findByStatus(String status);
    boolean updateStatusAndReason(String name, String status, String reason);

    boolean saveRegister(RegisterEntity registerEntity);

//    boolean updateDetails(String name,RegisterDto registerDto);

    public RegisterEntity updateRegister(String name, long phone);


}
