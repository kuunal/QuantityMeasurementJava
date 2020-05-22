/****************************************************************
 * @Purpose: Providing runtime exception for mismatch quantities.
 * @Author: Kunal Deshmukh
 * @Date: 21-05-2020
 ****************************************************************/


package com.quantitymeasurement.exception;

public class QuantityMeasurementExceptions extends RuntimeException{

    public enum TYPE{NEGATIVE_QUANTITY,QUANTITY_MISMATCH};
    public TYPE type;

    public QuantityMeasurementExceptions(String message, TYPE type){
        super(message);
        this.type=type;
    }

}
