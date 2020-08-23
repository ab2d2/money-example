package com.driven;

public class Dollar {
    int amount;
    Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        //an implication of Value Objects - which states you must return a new object in all operations
        // this pattern removes 'aliasing' problem
        return new Dollar(amount * multiplier);
    }
}