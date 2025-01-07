package com.springbootprojects.bankapplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootprojects.bankapplication.Entity.Account;


@Repository
public interface Account_Repository  extends JpaRepository<Account, Long> {
    
}
