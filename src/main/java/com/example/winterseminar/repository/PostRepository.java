package com.example.winterseminar.repository;

import com.example.winterseminar.domain.Post;
import com.example.winterseminar.domain.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Member;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
