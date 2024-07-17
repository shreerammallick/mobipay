package com.mobipaysecuri.assignment.controller;

import com.mobipaysecuri.assignment.model.LoanAccount;
import com.mobipaysecuri.assignment.service.LoanAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class LoanAccountController {


    @Autowired
    private LoanAccountService loanAccountService;

    @GetMapping("/loan_account/{accountNumber}")
    public ResponseEntity<LoanAccount> getLoanAccount(@PathVariable String accountNumber) {
        try {
            LoanAccount loanAccount = loanAccountService.getLoanAccount(accountNumber);
            return ResponseEntity.ok(loanAccount);
        } catch (Exception ex) {
            log.error("Error fetching loan account: {}", ex.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


}
