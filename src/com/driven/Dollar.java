package com.driven;

public class Dollar {
    private int amount;
    Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        //an implication of Value Objects - which states you must return a new object in all operations
        // this pattern removes 'aliasing' problem
        return new Dollar(amount * multiplier);
    }

    public boolean equals(Object obj) {
        Dollar dollar = (Dollar) obj;
        return amount == dollar.amount;
    }
}