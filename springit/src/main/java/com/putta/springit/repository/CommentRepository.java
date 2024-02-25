package com.putta.springit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.putta.springit.domain.Comment;

public interface CommentRepository extends JpaRepository<Comment,Long> {

}
