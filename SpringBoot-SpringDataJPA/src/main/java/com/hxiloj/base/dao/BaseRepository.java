package com.hxiloj.base.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

/**
 * @author Henry
 *
 */


@NoRepositoryBean
public interface BaseRepository <T, ID extends Serializable> extends Repository<T, ID>{

	<S extends T> S save(S entity);
	
	Optional<T> findById(ID primaryKey);
	
	List<T> findAll();    
	
	long count();    
	
	void delete(T entity);  
	
	boolean existsById(ID primaryKey); 
	 
}
