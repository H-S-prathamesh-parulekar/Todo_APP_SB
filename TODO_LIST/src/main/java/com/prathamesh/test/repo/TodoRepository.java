package com.prathamesh.test.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.prathamesh.test.todo.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer>{

	 @Query("SELECT e FROM Todo  e order by id desc")
  public List<Todo> findByUsername(String username);

    @Query("SELECT e FROM Todo  e")
  	 List<Todo> findAllNames();
	
//	 @Query("FROM todo WHERE username = ?1")
//	  List<Todo> findByUsername(String username);
//  
//  @Query(value = "SELECT e FROM TODO")
//  public List<Todo> findByUsernameall();

}
