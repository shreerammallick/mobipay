package com.mobipaysecuri.assignment.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class LoanAccountData {

    private String loanAccountNumber;

    private double totalDue;

    private Date nextDueDate;

    private LoanDetails loanDetails;

    private List<EmiDetails> emiDetails;

}
