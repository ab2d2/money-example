package com.driven;

public class Franc extends Money{
    @Override
    String currency() {
        return "CHF";
    }

    Franc(int amount) {
        super(amount);
    }

    Franc times(int multiplier) {
        //an implication of Value Objects - which states you must return a new object in all operations
        // this pattern removes 'aliasing' problem
        return new Franc(amount * multiplier);
    }


}