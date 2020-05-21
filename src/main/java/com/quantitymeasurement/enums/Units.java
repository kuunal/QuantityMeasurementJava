package com.quantitymeasurement.enums;

public enum Units {
    FEET(12),
    INCH(1),
    YARD(36),
    CentiMeter(0.4),
    MILI_LITRE(0.001),
    LITRE(1),
    GALLON(3.78);


    public double unit;

    Units(double unit){
        this.unit=unit;
    }

    Double getUnitValue(){
        return this.unit;
    }

}
