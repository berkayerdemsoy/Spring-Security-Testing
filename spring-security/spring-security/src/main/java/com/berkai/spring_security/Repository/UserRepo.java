package com.berkai.spring_security.Repository;

import com.berkai.spring_security.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
    User findByUsername(String username);

}
