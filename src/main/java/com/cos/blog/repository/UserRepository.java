package com.cos.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cos.blog.model.User;

//자동으로 bean 등록 
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	@Query(value = "select u from User u")
	public List<User> selectAllUser();
	
	@Query(value = "select u from User u WHERE id = ?1")
	public List<User> selectUser(int id);
	
}
