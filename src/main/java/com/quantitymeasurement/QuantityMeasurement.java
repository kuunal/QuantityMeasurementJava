package com.quantitymeasurement;

import com.quantitymeasurement.enums.Units;
import com.quantitymeasurement.exception.QuantityMeasurementExceptions;

public class QuantityMeasurement {

    double quantity;

    QuantityMeasurement(){}

    QuantityMeasurement(Double quantity,Units units){
        this.quantity = quantity*units.unit;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if(this==obj)
            return true;
        QuantityMeasurement quantityMeasurement = (QuantityMeasurement) obj;
        return Double.compare(this.quantity,quantityMeasurement.quantity)==0;

    }


    Double getConvertedUnit(double length, Units unit){
        if(unit.unit>=0)
            return unit.unit * length;
        throw new QuantityMeasurementExceptions("Negative lengths not allowed", QuantityMeasurementExceptions.TYPE.NEGATIVE_QUANTITY);
    }
}
