package com.burcu.repository;


import com.burcu.entity.CommentLike;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentLikeRepository extends MongoRepository<CommentLike,String> {
}
