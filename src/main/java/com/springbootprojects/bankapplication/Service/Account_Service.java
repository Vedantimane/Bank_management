package com.springbootprojects.bankapplication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootprojects.bankapplication.Entity.Account;
import com.springbootprojects.bankapplication.Repository.Account_Repository;

@Service
public class Account_Service {

    @Autowired
    private Account_Repository Ar;

    public List<Account> getalldetails(Account account){
        return Ar.findAll();
    }

    public String accountcreated(Account account){
        Ar.save(account);
        return "Account is created";
    }

     // Method to delete an account by its ID
     public String deleteAccountById(long id) {
        if (Ar.existsById(id)) {
            Ar.deleteById(id);
            return "Account deleted successfully";
        } else {
            return "Account with ID " + id + " not found";
        }
    }
    public String updateBalance(long id, double newBalance) {
        return Ar.findById(id).map(account -> {
            account.setBalance(newBalance);
            Ar.save(account);
            return "Balance updated successfully!";
        }).orElse("Account not found!");
    }

    
    
}


