package com.driven;

public class Money {
    protected int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount;
    }
}
