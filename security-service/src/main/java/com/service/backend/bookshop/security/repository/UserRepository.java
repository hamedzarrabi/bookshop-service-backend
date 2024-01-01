package com.service.backend.bookshop.security.repository;


import com.service.backend.bookshop.common.entity.security.Role;
import com.service.backend.bookshop.common.entity.security.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByEmail(String email);
    User findByRole(Role role);
}
