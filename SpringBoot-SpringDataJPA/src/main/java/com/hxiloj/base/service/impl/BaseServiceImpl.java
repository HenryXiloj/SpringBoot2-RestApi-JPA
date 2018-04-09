package com.hxiloj.base.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.hxiloj.base.dao.BaseRepository;
import com.hxiloj.base.service.BaseService;

@Transactional
public class BaseServiceImpl <T, ID extends Serializable> implements BaseService<T, ID>{

	@Autowired(required=true)
	BaseRepository<T, ID> baseRepository;
    	
	@Override
	public <S extends T> S save(S entity) {
		return baseRepository.save(entity);
	}

	@Override
	public Optional<T> findById(ID primaryKey) {
		// TODO Auto-generated method stub
		return baseRepository.findById(primaryKey);
	}

	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return baseRepository.findAll();
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return baseRepository.count();
	}

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		baseRepository.delete(entity);
	}

	@Override
	public boolean existsById(ID primaryKey) {
		// TODO Auto-generated method stub
		return baseRepository.existsById(primaryKey);
	}

}
