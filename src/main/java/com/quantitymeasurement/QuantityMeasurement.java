package com.quantitymeasurement;

import com.quantitymeasurement.enums.Units;
import com.quantitymeasurement.exception.QuantityMeasurementExceptions;

public class QuantityMeasurement {

    double quantity;

    QuantityMeasurement(){
    }

    QuantityMeasurement(double quantity,Units units){
        if (quantity<0)
            throw new QuantityMeasurementExceptions("Negative lengths not allowed", QuantityMeasurementExceptions.TYPE.NEGATIVE_QUANTITY);
        this.quantity = quantity*units.unit;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if(this==obj)
            return true;
        if(this.getClass()==obj.getClass())
            return true;
        QuantityMeasurement quantityMeasurement = (QuantityMeasurement) obj;
        return Double.compare(this.quantity,quantityMeasurement.quantity)==0;

    }


}
