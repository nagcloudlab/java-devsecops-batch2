package com.example.web;

import com.example.exeception.AccountBalanceException;
import com.example.service.TransferService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TransferController {

    @Autowired
    private TransferService transferService;


    @RequestMapping(method = RequestMethod.GET, value = "/transfer")
    public String transfer() {
        // This method will handle GET requests to /transfer
        return "transfer-form"; // This should return the name of the view to be rendered
    }

    @RequestMapping(method = RequestMethod.POST, value = "/transfer")
    public String processTransfer(HttpServletRequest request) {
        // This method will handle POST requests to /transfer
        String fromAccount = request.getParameter("fromAccount");
        String toAccount = request.getParameter("toAccount");
        double amount = Double.parseDouble(request.getParameter("amount"));
        // Here you would typically process the transfer logic
        try {
            transferService.transfer(fromAccount, toAccount, amount);
            return "transfer-success"; // This should return the name of the view to be rendered after processing
        } catch (AccountBalanceException e) {
            // Handle the exception, e.g., log it and return an error view
            request.setAttribute("errorMessage", e.getMessage());
            return "transfer-error"; // This should return the name of the error view to be rendered
        } catch (Exception e) {
            // Handle any other exceptions that may occur
            request.setAttribute("errorMessage", "An unexpected error occurred: " + e.getMessage());
            return "transfer-error"; // This should return the name of the error view to be rendered
        }

    }

}
