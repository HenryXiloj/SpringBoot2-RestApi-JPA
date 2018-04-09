package com.hxiloj.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.hxiloj.base.dao.BaseRepository;
import com.hxiloj.model.User;

public interface UserRepository extends BaseRepository<User, Long>{
	
	 @Query("select u from User u where u.email = ?1")
	 User findByEmailAddress(String emailAddress);
	 
	 @Query(value = "SELECT * FROM user_acl u WHERE u.name = 'Henry'",
            nativeQuery=true
     )
      public List<User> findByName();
}
