package com.quantitymeasurement.enums;

public enum Units {
    FEET(12),
    INCH(1),
    YARD(36),
    CentiMeter(0.4),
    MILI_LITRE(0.001),
    LITRE(1),
    GALLON(3.78),
    KILO_GRAM(1),
    GRAM(0.001),
    TONNE(1000),
    FARENHEIT(1),
    CELSIUS(33.8);


    public double unit;

    Units(double unit){
        this.unit=unit;
    }

}
