package com.marriageonmind.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marriageonmind.persistence.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    @Override
    void delete(User user);

}
