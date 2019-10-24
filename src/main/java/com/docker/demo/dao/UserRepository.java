package com.docker.demo.dao;

import com.docker.demo.entry.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
