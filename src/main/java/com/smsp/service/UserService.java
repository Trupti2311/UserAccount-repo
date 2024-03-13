package com.smsp.service;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smsp.pojo.User;
import com.smsp.repository.UserRpository;


@Service
public class UserService {
@Autowired	
UserRpository userRepo;

@Autowired
EntityManager entityManager;

public Boolean validateUser(User user) {
	TypedQuery<User> query=entityManager.createQuery("from User where email=:email AND password=:password",User.class);
	query.setParameter("email", user.getEmail());
	query.setParameter("password", user.getPassword());
	//List<User> dbuser= query.getResultList();
	if(query.getResultList().size()>0) {
		System.out.println("user found in database");
		return true;
	}else {
		System.out.println("user not found in db");
		return false;
	}
}

public void save(User user) {
	userRepo.save(user);
	
}
}
