package com.driven;

public class Franc extends Money{
    private String currency;

    @Override
    String currency() {
        return currency;
    }

    Franc(int amount) {
        super(amount);
        currency = "CHF";
    }

    Franc times(int multiplier) {
        //an implication of Value Objects - which states you must return a new object in all operations
        // this pattern removes 'aliasing' problem
        return new Franc(amount * multiplier);
    }


}