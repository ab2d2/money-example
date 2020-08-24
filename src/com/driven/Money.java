package com.driven;

class Money {

    private int amount;
    private String currency;

    String currency() {
        return currency;
    }

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount
                && currency().equals(money.currency());
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public String toString() {
        return amount + " " + currency;
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }


}
