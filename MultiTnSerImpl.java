package com.example.soap;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService(endpointInterface="com.example.soap.MultiTnSer")
public class MultiTnSerImpl implements MultiTnSer{


    @Override
    public int mutiTNo(int num1, int num2, int num3) {
//        int largest = Math.max(num1, Math.max(num2, num3));
        int tsum = num1+num2+num3;
        return tsum;
    }

    @Override
    public int square(int num1) {
        int Square = num1*num1*num1;
        return Square;
    }
}
