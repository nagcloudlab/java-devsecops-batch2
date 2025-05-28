package com.example;


class TransactionCount {
    long count = 0L;

    public synchronized void increment() {
        count++;
        /*
            - read the current value of count
            - increment the value by 1
            - write the new value back to count

            - t1 -> read count (0)
            - t2 -> read count (0)
            - t1 -> increment count (1)
            - t2 -> increment count (1)
            - t1 -> write count (1)
            - t2 -> write count (1)

            -> this is called 'race condition' problem

         */
    }

    public long getCount() {
        return count;
    }
}

public class How_To_Share_State_Between_Threads {
    public static void main(String[] args) throws InterruptedException {

        TransactionCount transactionCount = new TransactionCount(); // shared state

        Runnable transactionTask = () -> {
            for (int i = 0; i < 1000; i++) {
                transactionCount.increment(); // increment the shared state
            }
        };

        Thread thread1 = new Thread(transactionTask, "t1");
        thread1.start();

        Thread thread2 = new Thread(transactionTask, "t2");
        thread2.start();

        thread1.join(); // wait for thread1 to finish
        thread2.join(); // wait for thread2 to finish

        System.out.println("Transaction count: " + transactionCount.getCount());


    }
}
