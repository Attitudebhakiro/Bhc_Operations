package com.Bhc_Ops.Bhc_API.model;

public class Debt {
    public Debt(float amount, int priority, float interestRate) {
        this.amount = amount;
        this.priority = priority;
        this.interestRate = interestRate;
    }
    public Debt(){

    }

    public float amount;
    public int priority;
    public float interestRate;
}
