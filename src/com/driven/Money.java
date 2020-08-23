package com.driven;

abstract class Money {
    abstract String currency();

    protected int amount;
    protected String currency;


    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }

    abstract Money times(int multiplier);

    static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

}
