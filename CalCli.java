package com.example.soap;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class CalCli {
    public static void main(String[] args) throws MalformedURLException {

        URL url = new URL("http://localhost:8080/cal?wsdl");

        QName qname =new QName("http://soap.example.com/","CalserImplService");

        Service service = Service.create(url,qname);

        Calser calser = service.getPort(Calser.class);

        int result =calser.add(10,20);
        System.out.println(result);
    }
}
