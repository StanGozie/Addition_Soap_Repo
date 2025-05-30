package com.example.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author Chigozie_Enyoghasi
 * @since 31/05/2025
 */
@WebService
public interface CalculatorService {
    @WebMethod
    int add(@WebParam(name = "a") int a, @WebParam(name = "b") int b);

}