package com.updatedata.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.updatedata.demo.Entity.User;

public interface Repo extends JpaRepository<User,Integer> {
    
}
