package com.driven;

public class Dollar extends Money{
    private String currency;

    @Override
    String currency() {
        return currency;
    }

    Dollar(int amount) {
        super(amount);
        currency = "USD";
    }

    Dollar times(int multiplier) {
        //an implication of Value Objects - which states you must return a new object in all operations
        // this pattern removes 'aliasing' problem
        return new Dollar(amount * multiplier);
    }

}