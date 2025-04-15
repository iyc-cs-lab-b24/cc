package com.example.soap;


import javax.jws.WebService;


@WebService(endpointInterface = "com.example.soap.CalculatorService")
public class CalculatorServiceImpl implements CalculatorService {


    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}
