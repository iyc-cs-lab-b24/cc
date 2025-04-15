package com.example.soap;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class MutiTnCli {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/multi?wsdl");

        QName qname = new QName("http://soap.example.com/","MultiTnSerImplService");

        Service service = Service.create(url,qname);

        MultiTnSer multiTnSer = service.getPort(MultiTnSer.class);

        int Result = multiTnSer.mutiTNo(1,9,2);
        int Squareroot = multiTnSer.square(3);
        System.out.println(Result);

        System.out.println(Squareroot);
    }
}
