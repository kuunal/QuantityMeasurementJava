package com.quantitymeasurement.enums;

public enum Units {
    FEET(12);

    public double unit;

    Units(double unit){
        this.unit=unit;
    }

    Double getUnitValue(){
        return this.unit;
    }

}
