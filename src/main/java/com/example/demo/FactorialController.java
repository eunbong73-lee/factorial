package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class FactorialController {

    private final FactorialService factorialService;

    public FactorialController(FactorialService factorialService) {
        this.factorialService = factorialService;
    }

    private final Logger logger = LoggerFactory.getLogger(FactorialController.class);

    @GetMapping("/factorial")
    public BigDecimal factorial(@RequestParam ("n") int n ){
        if ( n < 0 )  {
            throw new ArithmeticException("n could be natural number");
        }

        logger.info("factorial : "+n);

        return factorialService.calculate(n);


    }
}
