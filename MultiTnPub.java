package com.example.soap;

import javax.xml.ws.Endpoint;

public class MultiTnPub {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/multi?wsdl",new MultiTnSerImpl());
        System.out.println("server running at https://localhost:8080/multi?wdsl");
    }
}
