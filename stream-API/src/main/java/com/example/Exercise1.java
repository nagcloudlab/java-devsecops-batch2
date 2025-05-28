package com.example;

import com.example.model.Trader;
import com.example.model.Transaction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exercise1 {
    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        //--------------------------------------------------------
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
        // Query 2: What are all the unique cities where the traders work?
        // Query 3: Find all traders from Cambridge and sort them by name.
        // Query 5: Are there any trader based in Milan?
        // Query 6: Update all transactions so that the traders from Milan are set to Cambridge
        //--------------------------------------------------------


        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
        transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted((t1, t2) -> Integer.compare(t2.getValue(), t1.getValue()))
                .forEach(System.out::println);

        System.out.println();
        // Query 2: What are all the unique cities where the traders work?
        transactions
                .stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);
        System.out.println();
        // Query 3: Find all traders from Cambridge and sort them by name.
        transactions
                .stream()
                .map(t -> t.getTrader())
                .filter(t -> t.getCity().equals("Cambridge"))
                .distinct()
                .sorted((t1, t2) -> t1.getName().compareTo(t2.getName()))
                .forEach(System.out::println);

        System.out.println();
        // Query 5: Are there any trader based in Milan?

        boolean areMilanTradersExists = transactions
                .stream().anyMatch(t -> t.getTrader().getCity().equals("Milan"));
        System.out.println(areMilanTradersExists);

        // Query 6: Update all transactions so that the traders from Milan are set to Cambridge
        transactions
                .stream()
                .filter(t -> t.getTrader().getCity().equals("Milan"))
                .forEach(t -> {
                    t.getTrader().setCity("Cambridge");
                });

        transactions
                .forEach(System.out::println);


    }
}
