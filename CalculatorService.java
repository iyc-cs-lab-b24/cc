package com.example.soap;


import javax.jws.WebService;


@WebService
public interface CalculatorService {
    int add(int num1, int num2);
}
