package com.example.soap;

import javax.jws.WebService;

@WebService
public interface MultiTnSer {
    int mutiTNo(int num1,int num2,int num3);

    int square(int num1);
}
