package com.smsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smsp.pojo.User;

@Repository
public interface UserRpository extends JpaRepository<User, Integer> {

}
