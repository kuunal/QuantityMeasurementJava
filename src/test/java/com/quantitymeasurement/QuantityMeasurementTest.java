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

    @Test
    public void givenTwoInch_AndFiveCentiMeter_WhenCompared_ReturnsTrue(){
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(2,INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(5,CentiMeter);
        Assert.assertTrue(quantityMeasurement1.checkEqual(quantityMeasurement));
    }

    @Test
    public void givenInches_WhenAdded_ReturnsSum_InInches(){
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(2,INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(2,INCH);
        double sumInInches = quantityMeasurement.addQuantities(quantityMeasurement,quantityMeasurement1);
        Assert.assertEquals(4,sumInInches,0);
    }

    @Test
    public void givenSingleInch_WhenForAddition_ReturnsSum_InInches(){
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(2,INCH);
        double sumInInches = quantityMeasurement1.addQuantities(quantityMeasurement1);
        Assert.assertEquals(2,sumInInches,0);
    }


    @Test
    public void givenNoQuantities_WhenForAddition_ReturnsZero(){
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(2,INCH);
        double sumInInches = quantityMeasurement1.addQuantities();
        Assert.assertEquals(0,sumInInches,0);
    }

    @Test
    public void givenOneFeet_AndTwoInch_WhenAdded_ReturnsSum_InInches(){
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1,FEET);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(2,INCH);
        double sumInInches = quantityMeasurement.addQuantities(quantityMeasurement,quantityMeasurement1);
        Assert.assertEquals(14,sumInInches,0);
    }

    @Test
    public void givenFeets_WhenAdded_ReturnsSum_InInches(){
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1,FEET);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(1,FEET);
        double sumInInches = quantityMeasurement.addQuantities(quantityMeasurement,quantityMeasurement1);
        Assert.assertEquals(24,sumInInches,0);
    }

    @Test
    public void givenInch_AndCentiMeter_WhenAdded_ReturnsSum_InInches(){
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(2,INCH);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(2.5,CentiMeter);
        double sumInInches = quantityMeasurement.addQuantities(quantityMeasurement,quantityMeasurement1);
        Assert.assertEquals(3,sumInInches,0);
    }

    @Test
    public void givenOneGallon_AndRespectiveLitres_WhenCompared_ReturnsTrue(){
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1,GALLON);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(3.78,LITRE);
        Assert.assertTrue(quantityMeasurement.checkEqual(quantityMeasurement1));
    }

    @Test
    public void givenOneLitre_AndThousandMiliLitre_WhenCompared_ReturnsTrue(){
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1,LITRE);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(1000,MILI_LITRE);
        Assert.assertTrue(quantityMeasurement1.checkEqual(quantityMeasurement));
    }

    @Test
    public void givenGallonAndLitres_WhenForAddition_ReturnsSumInLitres(){
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1,GALLON);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(3.78,LITRE);
        double sumInInches = quantityMeasurement.addQuantities(quantityMeasurement,quantityMeasurement1);
        Assert.assertEquals(7.57,sumInInches,0.1);
    }


    @Test
    public void givenOneKiloGram_And1000Grams_WhenCompared_ReturnsTrue(){
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1,KILO_GRAM);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(1000,GRAM);
        Assert.assertTrue(quantityMeasurement.checkEqual(quantityMeasurement1));
    }

    @Test
    public void givenOneTon_And1000KiloGram_WhenCompared_ReturnsTrue(){
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1,TONNE);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(1000,KILO_GRAM);
        Assert.assertTrue(quantityMeasurement.checkEqual(quantityMeasurement1));
    }

    @Test
    public void givenOneTon_AndThousandGram_WhenForAddition_ReturnsTotal_InKiloGrams(){
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1,TONNE);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(1000,GRAM);
        double totalInKiloGram = quantityMeasurement.addQuantities(quantityMeasurement,quantityMeasurement1);
        Assert.assertEquals(1001,totalInKiloGram,0);
    }

    @Test
    public void givenTwoHundredAndTwoFarenheit_AndHundredCelsius_WhenCompared_ReturnsTrue(){
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(212,FARENHEIT);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(100,CELSIUS);
        Assert.assertTrue(quantityMeasurement.checkEqual(quantityMeasurement1));
    }
}
