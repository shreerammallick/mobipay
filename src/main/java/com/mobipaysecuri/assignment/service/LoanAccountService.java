package com.mobipaysecuri.assignment.service;

import com.mobipaysecuri.assignment.dao.LoanAccountDao;
import com.mobipaysecuri.assignment.dto.LoanAccountData;
import com.mobipaysecuri.assignment.model.LoanAccount;
import com.mobipaysecuri.assignment.restclient.Accounts;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class LoanAccountService {

    @Autowired
    LoanAccountDao loanAccountDao;

    @Autowired
    private Accounts accounts;

    public LoanAccount getLoanAccount(String loanAccountNumber) {
        log.info("Fetching loan account with number: {}", loanAccountNumber);

        try {
            Optional<LoanAccount> loanAccountOptional = loanAccountDao.findLoanAccount(loanAccountNumber);
            if (loanAccountOptional.isPresent()) {
                log.info("Loan account found in database.");
                return loanAccountOptional.get();
            } else {
                log.info("Loan account not found in database, calling external API.");
                LoanAccountData loanAccountData = accounts.fetchLoanAccount(loanAccountNumber);
                log.info("Loan account fetched from external API, saving to database.");
                return loanAccountDao.saveLoanAccount(loanAccountData);
            }
        } catch (DataAccessException ex) {
            log.error("Error accessing database: {}", ex.getMessage());
            throw new RuntimeException("Error accessing database", ex);
        } catch (Exception ex) {
            log.error("Error fetching loan account: {}", ex.getMessage());
            throw new RuntimeException("Error fetching loan account", ex);
        }
    }
}
