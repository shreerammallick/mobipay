package com.mobipaysecuri.assignment.dto;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.util.Date;

@Data
public class EmiDetails {
    private int emiNumber;
    private Date dueDate;
    private double emiAmount;
    private String status;
    private Date paymentDate;
}
