package com.example.soap;


import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;


public class CalculatorClient {


    public static void main(String[] args) throws Exception {
        // URL to the WSDL
        URL url = new URL("http://localhost:8080/calculator?wsdl");


        // Correct QName based on the WSDL (Check the actual service name)
        QName qname = new QName("http://soap.example.com/", "CalculatorServiceImplService");


        // Creating service instance
        Service service = Service.create(url, qname);


        // Getting the port and invoking the method
        CalculatorService calculator = service.getPort(CalculatorService.class);


        int result = calculator.add(10, 20);
        System.out.println("Result: " + result);
    }
}

