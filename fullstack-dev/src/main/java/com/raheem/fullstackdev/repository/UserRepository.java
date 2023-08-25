package com.raheem.fullstackdev.repository;

import com.raheem.fullstackdev.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {

}
