package com.example.cor;


interface Handler {
    void setNextHandler(Handler nextHandler);

    void handle(double amount);
}

class FiveHundredHandler implements Handler {
    Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(double amount) {
        if (amount >= 500) {
            int count = (int) (amount / 500);
            System.out.println("500 -> " + count);
            amount = amount - (count * 500);
        }
        if (amount > 0) {
            if (nextHandler != null) {
                nextHandler.handle(amount);
            }
        }
    }
}

class TwoHundredHandler implements Handler {
    Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(double amount) {
        if (amount >= 200) {
            int count = (int) (amount / 200);
            System.out.println("200 -> " + count);
            amount = amount - (count * 200);
        }
        if (amount > 0) {
            if (nextHandler != null) {
                nextHandler.handle(amount);
            }
        }
    }
}

class OneHundredHandler implements Handler {
    Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(double amount) {
        if (amount >= 100) {
            int count = (int) (amount / 100);
            System.out.println("100 -> " + count);
            amount = amount - (count * 100);
        }
        if (amount > 0) {
            if (nextHandler != null) {
                nextHandler.handle(amount);
            }
        }
    }
}


public class ATMMachine {
    public static void main(String[] args) {

        Handler fiveHundredHandler = new FiveHundredHandler();
        Handler twoHundredHandler = new TwoHundredHandler();
        Handler oneHundredHandler = new OneHundredHandler();

        // chain-1 => handler-(500) -> handler-(200) -> handler-(100)
//        twoHundredHandler.setNextHandler(oneHundredHandler);
//        fiveHundredHandler.setNextHandler(twoHundredHandler);
//
//        fiveHundredHandler.handle(1800);

        // chain-2 =>  handler-(500) -> handler-(100)
        fiveHundredHandler.setNextHandler(oneHundredHandler);
        fiveHundredHandler.handle(1800);


    }

}
