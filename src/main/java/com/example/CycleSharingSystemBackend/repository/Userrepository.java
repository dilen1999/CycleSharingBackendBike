package com.example.CycleSharingSystemBackend.repository;

import com.example.CycleSharingSystemBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Userrepository extends JpaRepository<User, Long> {
}
