package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.quantitymeasurement.enums.Units.FEET;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement ;

    @Before
    public void init(){
        quantityMeasurement = new QuantityMeasurement();
    }

    @Test
    public void givenFeet_WhenEqual_ReturnsTrue(){
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(0.0,FEET);
        QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(0.0,FEET);
        Assert.assertTrue(quantityMeasurement1.equals(quantityMeasurement2));
    }


}