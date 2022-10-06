package com.efj.calculator.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class CalculatorServiceTest {
    
    @Autowired
    private CalculatorService calculatorService; 
    
    @Test
    void givenTwoNumbers_whenAddition_thenObtainAPlusB() {
        int a = 2;
        int b = 2;
        int expectedResult = 4;
        
        int sum = calculatorService.sum(a, b);
        
        assertEquals(expectedResult, sum, "Unexpected sum obtained");
    }
    
    @Test
    void givenTwoNumbers_whenSubstraction_thenObtainAMinusB() {
        int a = 5;
        int b = 2;
        int expectedResult = 3;
        
        int sum = calculatorService.substract(a, b);
        
        assertEquals(expectedResult, sum, "Unexpected substraction obtained");
    }
    
    @Test
    void givenTwoNumbers_whenMultiplication_thenObtainATimesB() {
        int a = 5;
        int b = 2;
        int expectedResult = 10;
        
        int sum = calculatorService.multiply(a, b);
        
        assertEquals(expectedResult, sum, "Unexpected multiplication obtained");
    }
    
    @Test
    void givenTwoNumbers_whenDivision_thenObtainADividedByB() {
        int a = 5;
        int b = 2;
        int expectedResult = 2;
        
        int sum = calculatorService.divide(a, b);
        
        assertEquals(expectedResult, sum, "Unexpected division obtained");
    }


}
