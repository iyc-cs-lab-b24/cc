package com.example.soap;


import javax.xml.ws.Endpoint;


public class CalculatorPublisher {


    public static void main(String[] args) {
        // Publishing the service at a specific URL
        Endpoint.publish("http://localhost:8080/calculator", new CalculatorServiceImpl());
        System.out.println("Service is running at http://localhost:8080/calculator");
    }
}
