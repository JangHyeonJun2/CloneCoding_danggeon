package com.clone_coding.danggeon.repository;

import com.clone_coding.danggeon.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
