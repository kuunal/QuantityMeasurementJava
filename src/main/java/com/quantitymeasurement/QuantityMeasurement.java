/****************************************************************
 * @Purpose: Checking Equality and addition of same Units.
 * @Author: Kunal Deshmukh
 * @Date: 21-05-2020
 ****************************************************************/

package com.quantitymeasurement;

import com.quantitymeasurement.enums.Units;
import com.quantitymeasurement.exception.QuantityMeasurementExceptions;

public class QuantityMeasurement {

    double quantity;
    String quantityType;

    QuantityMeasurement(double quantity,Units units){
        if (quantity<0)
            throw new QuantityMeasurementExceptions("Negative lengths not allowed", QuantityMeasurementExceptions.TYPE.NEGATIVE_QUANTITY);
        if(units.equals(Units.CELSIUS)) {
            this.quantity = (quantity * 9 / 5) + 32;
        }
        else
            this.quantity = quantity*units.unit;
        this.quantityType=units.quantityType;
    }

    /**+
     *
     * @param: QuantityMeasurement obj.
     * @purpose: To compare unit of same type.
     * @return: Boolean based on comparison of equality.
     */
    public boolean checkEqual(QuantityMeasurement obj){
        if(this.quantityType!=obj.quantityType)
            throw new QuantityMeasurementExceptions("Different quantites cannot be compared", QuantityMeasurementExceptions.TYPE.QUANTITY_MISMATCH);
        return Double.compare(this.quantity,obj.quantity)==0;
    }

    /**+
     *
     * @param: obj
     * @purpose: To check given objects are null, same reference or same type of object.
     * @return: Boolean based on Null, Reference and same type.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (this.getClass() == obj.getClass())
            return true;
        return false;
    }


    /**+
     *
     * @param: quantityMeasurement object array.
     * @purpose: Takes multiple units of same types and performs addition of them.
     * @return: total addition of same units.
     */
    public double addQuantities(QuantityMeasurement ...quantityMeasurement) {
        if(quantityMeasurement.length==0){
            return 0;
        }else if(quantityMeasurement.length==1){
            return quantityMeasurement[0].quantity;
        }else{
            double total=0;
            for(QuantityMeasurement quantityObject : quantityMeasurement){
                if(this.quantityType!=quantityObject.quantityType)
                    throw new QuantityMeasurementExceptions("Different quantites cannot be added", QuantityMeasurementExceptions.TYPE.QUANTITY_MISMATCH);
                total+=quantityObject.quantity;
            }
            return total;
        }
    }
}
