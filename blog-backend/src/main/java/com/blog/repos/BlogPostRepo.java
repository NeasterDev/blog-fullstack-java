package com.blog.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.models.BlogPost;

public interface BlogPostRepo extends JpaRepository<BlogPost, Long>{

}
