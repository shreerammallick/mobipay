package com.mobipaysecuri.assignment.restclient;

import com.mobipaysecuri.assignment.dto.LoanAccountData;
import com.mobipaysecuri.assignment.model.LoanAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class Accounts {

    @Value("${accounts.url}")
    private String baseUrl;

    @Autowired
    private RestTemplate restTemplate;

    public LoanAccountData fetchLoanAccount(String loanAccountNumber) {
        String url = baseUrl +"/"+ loanAccountNumber;
        return restTemplate.getForObject(url, LoanAccountData.class);
    }
}
