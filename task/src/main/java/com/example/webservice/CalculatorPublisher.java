package com.example.webservice;

import javax.xml.ws.Endpoint;

/**
 * @author Chigozie_Enyoghasi
 * @since 31/05/2025
 */
public class CalculatorPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:6060/calculator", new CalculatorServiceImpl());
        System.out.println("Service is running at http://localhost:5050/calculator?wsdl");
    }
}