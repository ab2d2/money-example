package com.driven;

abstract class Money {
    abstract String currency();

    protected int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }

    abstract Money times(int multiplier);

    static Money franc(int amount) {
        return new Franc(amount);
    }

    static Money dollar(int amount) {
        return new Dollar(amount);
    }

}
