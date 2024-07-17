package com.mobipaysecuri.assignment.dao.impl;

import com.mobipaysecuri.assignment.dao.LoanAccountDao;
import com.mobipaysecuri.assignment.dto.LoanAccountData;
import com.mobipaysecuri.assignment.model.LoanAccount;
import com.mobipaysecuri.assignment.repository.LoanAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
public class LoanAccountDaoImpl implements LoanAccountDao {

    @Autowired
    private LoanAccountRepository repository;


    public Optional<LoanAccount> findLoanAccount(String loanAccountNumber) {
        return repository.findById(loanAccountNumber);
    }

    public LoanAccount saveLoanAccount(LoanAccountData loanAccountData) {
        LoanAccount loanAccount = new LoanAccount();
        loanAccount.setDueDate(loanAccountData.getNextDueDate().toString());
        loanAccount.setLoanAccountNumber(loanAccountData.getLoanAccountNumber());
        loanAccount.setEmiAmount((int) loanAccountData.getEmiDetails().get(0).getEmiAmount());
        return repository.save(loanAccount);
    }

}
