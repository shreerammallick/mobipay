package com.mobipaysecuri.assignment.repository;

import com.mobipaysecuri.assignment.model.LoanAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanAccountRepository extends JpaRepository<LoanAccount, String> {
}
