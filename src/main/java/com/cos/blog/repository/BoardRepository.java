package com.cos.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cos.blog.model.Board;
import com.cos.blog.model.User;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer>{
	
	@Query(value = "select u from Board u")
	public List<User> selectAllBoard();

}
