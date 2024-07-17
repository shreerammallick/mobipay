package com.mobipaysecuri.assignment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class LoanAccount {
    @Id
    private String loanAccountNumber;
    private String dueDate;
    private int emiAmount;

}
