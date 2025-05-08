package com.RegistrationForm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RegistrationForm.entity.User;

@Repository
public interface Userrepo extends JpaRepository<User,Long> {
	Optional<User> findByEmailAndPassword(String email, String password);

}
