package com.quantitymeasurement.enums;

public enum Units {
    FEET(12),
    INCH(1),
    YARD(36),
    CentiMeter(0.4),
    MILI_LITRE(1),
    LITRE(1000),
    GALLON(3780);


    public double unit;

    Units(double unit){
        this.unit=unit;
    }

    Double getUnitValue(){
        return this.unit;
    }

}
