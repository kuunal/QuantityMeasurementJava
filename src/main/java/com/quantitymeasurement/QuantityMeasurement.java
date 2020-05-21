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

    public boolean checkEqual(Object obj){
        QuantityMeasurement quantityMeasurement = (QuantityMeasurement) obj;
        return Double.compare(this.quantity,quantityMeasurement.quantity)==0;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if(this==obj)
            return true;
        if(this.getClass()==obj.getClass())
            return true;
        return false;
    }


    public double addQuantities(QuantityMeasurement ...quantityMeasurement) {
        if(quantityMeasurement.length==0){
            return 0;
        }else if(quantityMeasurement.length==1){
            return quantityMeasurement[0].quantity;
        }else{
            double total=0;
            for(QuantityMeasurement quantityObject : quantityMeasurement){
                total+=quantityObject.quantity;
            }
            return total;
        }
    }
}
