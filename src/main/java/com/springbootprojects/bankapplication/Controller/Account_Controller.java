package com.springbootprojects.bankapplication.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springbootprojects.bankapplication.Entity.Account;
import com.springbootprojects.bankapplication.Service.Account_Service;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
@RequestMapping("/")
public class Account_Controller {

    @Autowired
    private Account_Service As;

    @GetMapping("account")
    public List<Account> getMethodName(Account account) {
       return As.getalldetails(account);
       
    }
    @PostMapping("account")
    public String createaccount(@RequestBody Account account) {
        As.accountcreated(account);
        
        return "account is created";
    }
    
    @DeleteMapping("account/{id}")
    public String deleteAccount(@PathVariable long id) {
        As.deleteAccountById(id);
        return "account is deleted";
    }


      @PutMapping("account/{id}")
    public String updateAccountBalance(@PathVariable long id, @RequestParam double newBalance) {
        return As.updateBalance(id, newBalance);
    }

    
    
}
