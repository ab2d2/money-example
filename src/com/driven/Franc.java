package com.driven;

public class Franc {
    private int amount;
    Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier) {
        //an implication of Value Objects - which states you must return a new object in all operations
        // this pattern removes 'aliasing' problem
        return new Franc(amount * multiplier);
    }

    public boolean equals(Object obj) {
        Franc franc = (Franc) obj;
        return amount == franc.amount;
    }
}