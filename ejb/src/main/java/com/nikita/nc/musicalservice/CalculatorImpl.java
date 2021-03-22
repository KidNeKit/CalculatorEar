package com.nikita.nc.musicalservice;

import javax.ejb.Stateless;

@Stateless
public class CalculatorImpl implements Calculator {

    public int sum(int a, int b) {
        return a + b;
    }
}

