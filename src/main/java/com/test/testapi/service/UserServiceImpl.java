package com.test.testapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.testapi.model.User;
import com.test.testapi.repo.UserRepo;

import lombok.RequiredArgsConstructor;


@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService
{
	private final UserRepo userRepo;


	@Override
	public List<User> getUsers() 
	{
		return userRepo.findAll();
	}
	

	@Override
	public User addUser(User user) 
	{
		return userRepo.save(user);
	}

	@Override
	public Optional<User> getUserById(Long id) 
	{
		return userRepo.findById(id);
	}

	@Override
	public void deleteUser(Long id) 
	{
		userRepo.deleteById(id);
	}

	@Override
	public User updateUser(User user)
	{
		return userRepo.save(user)	;
	}

}
