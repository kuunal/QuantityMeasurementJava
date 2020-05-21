package com.quantitymeasurement.exception;

public class QuantityMeasurementExceptions extends RuntimeException{

    public enum TYPE{NEGATIVE_QUANTITY};
    public TYPE type;

    public QuantityMeasurementExceptions(String message, TYPE type){
        super(message);
        this.type=type;
    }

}
