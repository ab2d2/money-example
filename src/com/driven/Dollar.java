package com.driven;

public class Dollar extends Money{

    @Override
    String currency() {
        return currency;
    }

    Dollar(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multiplier) {
        //an implication of Value Objects - which states you must return a new object in all operations
        // this pattern removes 'aliasing' problem
        return Money.dollar(amount * multiplier);
    }

}