package com.quantitymeasurement;

public class QuantityMeasurement {

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        return true;
    }

    Double getConvertedUnit(double length,Units unit){
        return unit.unit * length;
    }
}
