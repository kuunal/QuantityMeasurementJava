package com.quantitymeasurement;

import com.quantitymeasurement.exception.QuantityMeasurementExceptions;
import org.junit.Assert;
import org.junit.Test;

import static com.quantitymeasurement.enums.Units.*;

public class QuantityMeasurementTest {


    @Test
    public void givenFeet_WhenEqual_ReturnsTrue(){
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(0.0,FEET);
        QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(0.0,FEET);
        Assert.assertTrue(quantityMeasurement1.checkEqual(quantityMeasurement2));
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
    public void givenFeet_WhenTypeEqual_ReturnsTrue(){
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(0.0,FEET);
        QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(0.0,FEET);
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
        Assert.assertFalse(quantityMeasurement1.checkEqual(quantityMeasurement));
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

    @Test
    public void givenInch_WhenNull_ReturnsFalse(){
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(0.0,INCH);
        QuantityMeasurement quantityMeasurement2 = null;
        Assert.assertFalse(quantityMeasurement1.equals(quantityMeasurement2));
    }

    @Test
    public void givenInch_WhenReferingToSame_ReturnsTrue(){
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(0.0,INCH);
        QuantityMeasurement quantityMeasurement2 = quantityMeasurement1;
        Assert.assertTrue(quantityMeasurement1.equals(quantityMeasurement2));
    }

    @Test
    public void givenInch_WhenTypeEqual_ReturnsTrue(){
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(0.0,INCH);
        QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(0.0,INCH);
        Assert.assertTrue(quantityMeasurement1.equals(quantityMeasurement2));
    }

    @Test
    public void givenInches_WhenValuesAreEqual_ReturnsTrue(){
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(1,INCH);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1,INCH);
        Assert.assertTrue(quantityMeasurement1.equals(quantityMeasurement));

    }

    @Test
    public void givenZeroInch_AndZeroFeet_WhenCompared_ReturnsTrue(){
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(0,FEET);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(0,INCH);
        Assert.assertTrue(quantityMeasurement1.equals(quantityMeasurement));
    }

    @Test
    public void givenOneFeet_AndOneInch_WhenCompared_ReturnsFalse(){
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(1,FEET);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1,INCH);
        Assert.assertFalse(quantityMeasurement.checkEqual(quantityMeasurement1));
    }


    @Test
    public void givenOneInch_AndOneFeet_WhenCompared_ReturnsFalse(){
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1,INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(1,FEET);
        Assert.assertFalse(quantityMeasurement1.checkEqual(quantityMeasurement));
    }

    @Test
    public void givenOneFeet_AndTwelveInch_WhenCompared_ReturnsTrue(){
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(1,FEET);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(12,INCH);
        Assert.assertTrue(quantityMeasurement.checkEqual(quantityMeasurement1));
    }

    @Test
    public void givenTwelveInch_AndOneFeet_WhenCompared_ReturnsTrue(){
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(12,INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(1,FEET);
        Assert.assertTrue(quantityMeasurement1.checkEqual(quantityMeasurement));
    }

    @Test
    public void givenThreeFeet_AndOneYard_WhenCompared_ReturnsTrue(){
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(3,FEET);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1, YARD);
        Assert.assertTrue(quantityMeasurement.checkEqual(quantityMeasurement1));
    }

    @Test
    public void givenOneFeet_AndOneYard_WhenCompared_ReturnsFalse(){
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(1,FEET);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1, YARD);
        Assert.assertFalse(quantityMeasurement.checkEqual(quantityMeasurement1));
    }

    @Test
    public void givenOneInch_AndOneYard_WhenCompared_ReturnsFalse(){
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(1,INCH);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1, YARD);
        Assert.assertFalse(quantityMeasurement.checkEqual(quantityMeasurement1));
    }

    @Test
    public void givenOneYard_AndThirtySixInch_WhenCompared_ReturnsTrue(){
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(1,YARD);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(36,INCH);
        Assert.assertTrue(quantityMeasurement.checkEqual(quantityMeasurement1));
    }

    @Test
    public void givenThirtySixInch_AndOneYard_WhenCompared_ReturnsTrue(){
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(36,INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(1,YARD);
        Assert.assertTrue(quantityMeasurement1.checkEqual(quantityMeasurement));
    }

    @Test
    public void givenOneYardAndThreeFeet_WhenCompared_ReturnsTrue(){
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1, YARD);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(3,FEET);
        Assert.assertTrue(quantityMeasurement1.checkEqual(quantityMeasurement));
    }

}