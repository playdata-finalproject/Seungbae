package com.finalproject.shelter.repository;


import com.finalproject.shelter.ShelterApplicationTests;
import com.finalproject.shelter.model.entity.AdminUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;


public class AdminUserRepositoryTest extends ShelterApplicationTests {

    @Autowired
    private AdminUserRepository adminUserRepository;

    @Test
    public void create(){
        AdminUser adminUser = new AdminUser();
        adminUser.setName("홍길동");
        adminUser.setRegisteredAt(LocalDateTime.now());

        AdminUser newadminuser = adminUserRepository.save(adminUser);
        Assertions.assertNotNull(newadminuser);
        System.out.println("newadminUser : " +newadminuser);
    }

    @Test
    public void read(){
        Optional<AdminUser> adminUser = adminUserRepository.findById(1L);
        Assertions.assertTrue(adminUser.isPresent());

        adminUser.ifPresent(selectAdminUser->{
            System.out.println("name : "+selectAdminUser.getName());
            System.out.println("create : "+selectAdminUser.getRegisteredAt());
        });
    }

    @Test
    public void update(){
        Optional<AdminUser> adminUser = adminUserRepository.findById(1L);
        Assertions.assertTrue(adminUser.isPresent());

        adminUser.ifPresent(selectAdminUser->{
            selectAdminUser.setName("이순신");
            selectAdminUser.setRegisteredAt(LocalDateTime.now());
            adminUserRepository.save(selectAdminUser);
        });
    }

    @Test
    @Transactional
    public void delete(){
        Optional<AdminUser> adminUser = adminUserRepository.findById(1L);
        Assertions.assertTrue(adminUser.isPresent());

        adminUser.ifPresent(selectAdminUser->{
            adminUserRepository.delete(selectAdminUser);
        });

        Optional<AdminUser> deleteAdminUser = adminUserRepository.findById(1L);
        Assertions.assertFalse(deleteAdminUser.isPresent());
    }


}
