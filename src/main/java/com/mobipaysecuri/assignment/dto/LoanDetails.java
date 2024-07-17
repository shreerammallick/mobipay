package com.mobipaysecuri.assignment.dto;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.util.Date;

@Data
public class LoanDetails {

    private String borrowerName;
    private String loanType;
    private double loanAmount;
    private double interestRate;
    private Date loanStartDate;
    private Date loanEndDate;

}
