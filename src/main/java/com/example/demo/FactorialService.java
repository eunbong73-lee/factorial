package com.example.demo;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class FactorialService {

    public BigDecimal calculate(int n){
        if (n <= 1){
            return BigDecimal.ONE;
        }

        return new BigDecimal(n).multiply(calculate((n-1)));
    }
}
