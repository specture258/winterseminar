package com.example.winterseminar.repository;

import com.example.winterseminar.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Member;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByusername(String username);
}
