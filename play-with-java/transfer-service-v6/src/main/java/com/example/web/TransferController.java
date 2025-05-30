package com.example.web;

import com.example.exeception.AccountBalanceException;
import com.example.service.TransferService;
import com.example.web.dto.TransferRequest;
import com.example.web.dto.TransferResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransferController {

    @Autowired
    private TransferService transferService;


    @RequestMapping(
            method = RequestMethod.POST,
            value = "/transfer",
            consumes = "application/json",
            produces = "application/json"
    )
    public TransferResponse processTransfer(@RequestBody TransferRequest request) {
        // This method will handle POST requests to /transfer
        String fromAccount = request.getFromAccount();
        String toAccount = request.getToAccount();
        double amount = request.getAmount();
        // Here you would typically process the transfer logic
        transferService.transfer(fromAccount, toAccount, amount);

        TransferResponse response = new TransferResponse();
        response.setStatus("success");
        response.setMessage("Transfer successful from " + fromAccount + " to " + toAccount + " of amount " + amount);
        return response;

    }

}
