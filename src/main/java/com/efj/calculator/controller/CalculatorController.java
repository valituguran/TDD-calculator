package com.efj.calculator.controller;

import com.efj.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CalculatorController {

    @Autowired
    CalculatorService service;

    @GetMapping("sum")
    public ResponseEntity<Integer> sum(@RequestParam int a, @RequestParam int b) {
        return ResponseEntity.of(Optional.of(service.sum(a, b)));
    }

    @GetMapping("substract")
    public ResponseEntity<Integer> substract(@RequestParam int a, @RequestParam int b) {
        return ResponseEntity.of(Optional.of(service.substract(a, b)));
    }

    @GetMapping("multiply")
    public ResponseEntity<Integer> multiply(@RequestParam int a, @RequestParam int b) {
        return ResponseEntity.of(Optional.of(service.multiply(a, b)));
    }

    @GetMapping("divide")
    public ResponseEntity<Integer> divide(@RequestParam int a, @RequestParam int b) {
        return ResponseEntity.of(Optional.of(service.divide(a, b)));
    }
}
