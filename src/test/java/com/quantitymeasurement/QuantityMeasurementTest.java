package com.quantitymeasurement;

import com.quantitymeasurement.exception.QuantityMeasurementExceptions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.quantitymeasurement.enums.Units.FEET;

public class QuantityMeasurementTest {


    @Test
    public void givenFeet_WhenEqual_ReturnsTrue(){
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(0.0,FEET);
        QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(0.0,FEET);
        Assert.assertTrue(quantityMeasurement1.equals(quantityMeasurement2));
    }

    @Test
    public void givenFeet_WhenNull_ReturnsFalse(){
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(0.0,FEET);
        QuantityMeasurement quantityMeasurement2 = null;
        Assert.assertFalse(quantityMeasurement1.equals(quantityMeasurement2));
    }

    @Test
    public void givenFeet_WhenReferingToSame_ReturnsTrue(){
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(0.0,FEET);
        QuantityMeasurement quantityMeasurement2 = quantityMeasurement1;
        Assert.assertTrue(quantityMeasurement1.equals(quantityMeasurement2));
    }

    @Test
    public void givenFeet_WhenValueIsEqual_ShouldReturnTrue(){
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(2.0,FEET);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(2,FEET);
        Assert.assertTrue(quantityMeasurement1.equals(quantityMeasurement));
    }

    @Test
    public void givenFeet_WhenValueIsNotEqual_ShouldReturnFalse(){
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(22.0,FEET);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(2,FEET);
        Assert.assertFalse(quantityMeasurement1.equals(quantityMeasurement));
    }

    @Test
    public void givenFeet_WhenNegativeValue_ThrowsException(){
        try {
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement(-2,FEET);
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(2,FEET);
            Assert.assertFalse(quantityMeasurement1.equals(quantityMeasurement));
        }catch (QuantityMeasurementExceptions e){
            Assert.assertEquals("Negative lengths not allowed",e.getMessage());
        }



    }


}