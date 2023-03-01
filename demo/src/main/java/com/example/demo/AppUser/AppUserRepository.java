package com.example.demo.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
//DATA Access Layer

@Repository
public interface AppUserRepository extends JpaRepository<AppUser,Long> {

    // SELECT * FROM app_user WHERE email = ?
    @Query("SELECT u FROM AppUser  u WHERE u.email = ?1")
    Optional<AppUser> findAppUserByEmail(String email); 
}
