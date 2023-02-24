package com.example.demo.myUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//DATA Access Layer

@Repository
public interface myUserRepository extends JpaRepository<myUser,Long> {
    
}
