package com.example.webservice;

import javax.jws.WebService;

/**
 * @author Chigozie_Enyoghasi
 * @since 31/05/2025
 */
@WebService(endpointInterface = "com.example.webservice.CalculatorService")
public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}