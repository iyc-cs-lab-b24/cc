package com.example.soap;

import javax.xml.ws.Endpoint;

public class CalserPub {
    public static void main(String[] args) {

        Endpoint.publish("http://localhost:8080/cal", new CalserImpl());
        System.out.println("running at https://localhost:8080/cal");
    }
}
