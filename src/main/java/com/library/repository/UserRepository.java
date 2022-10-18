package com.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.domain.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
