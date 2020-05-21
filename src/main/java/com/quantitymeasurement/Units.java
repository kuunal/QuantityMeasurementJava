package com.quantitymeasurement;

public enum Units {
    FEET(12);

    double unit;

    Units(double unit){
        this.unit=unit;
    }

    Double getUnitValue(){
        return this.unit;
    }

}
