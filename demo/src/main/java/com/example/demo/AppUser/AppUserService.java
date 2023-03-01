package com.example.demo.AppUser;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;


//SERVICE layer

@Service
public class AppUserService {

	private final AppUserRepository appUserRepository;

	@Autowired
	public AppUserService(AppUserRepository myUserRepository) {
		this.appUserRepository = myUserRepository;
	}
    public List<AppUser> getAppUser(){
		return appUserRepository.findAll();
	}
	public void addNewAppUser(AppUser appUser) {
		Optional<AppUser> user = appUserRepository.findAppUserByEmail(appUser.getEmail());
		if (user.isPresent()) {
			throw new IllegalStateException("email taken");
		}
		// System.out.println(appUser);
		appUserRepository.save(appUser);
	}
	public void deleteAppUser(Long appUserId) {
		boolean exists = appUserRepository.existsById(appUserId);
		if (!exists) {
			throw new IllegalStateException("appUser with id: " + appUserId + " does not exists");
		}
		appUserRepository.deleteById(appUserId);
	}
	@Transactional
	public void updateAppUser(	Long appUserId, 
								String name, 
								String email) {
		AppUser appUser = appUserRepository.findById(appUserId)
			.orElseThrow(() -> new IllegalStateException(
				"appUser with id: " + appUserId + " does not exists"));

		if (name != null && 
				name.length() > 0 && 
				!Objects.equals(appUser.getName(), name)){
			appUser.setName(name);
		}
		if (email != null && 
				email.length() > 0 && 
				!Objects.equals(appUser.getEmail(), email)){
			Optional<AppUser> userOptional = appUserRepository.findAppUserByEmail(email);
			if (userOptional.isPresent()) {
				throw new IllegalStateException("email taken");
			}
			appUser.setEmail(email);
		}

	}
}
