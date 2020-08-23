package com.driven;

public class Dollar extends Money{
    @Override
    String currency() {
        return "USD";
    }

    Dollar(int amount) {
        super(amount);
    }

    Dollar times(int multiplier) {
        //an implication of Value Objects - which states you must return a new object in all operations
        // this pattern removes 'aliasing' problem
        return new Dollar(amount * multiplier);
    }

}