package com.quantitymeasurement.enums;

public enum Units {
    FEET(12),
    INCH(1),
    YARD(36);


    public double unit;

    Units(double unit){
        this.unit=unit;
    }

    Double getUnitValue(){
        return this.unit;
    }

}
