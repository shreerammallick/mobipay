package com.mobipaysecuri.assignment.dao;

import com.mobipaysecuri.assignment.dto.LoanAccountData;
import com.mobipaysecuri.assignment.model.LoanAccount;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface LoanAccountDao {
    Optional<LoanAccount> findLoanAccount(String loanAccountNumber);

    LoanAccount saveLoanAccount(LoanAccountData loanAccountData);


}
