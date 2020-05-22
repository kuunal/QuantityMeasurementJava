/****************************************************************
 * @Purpose: Converting units to base unit.
 * @Author: Kunal Deshmukh
 * @Date: 21-05-2020
 ****************************************************************/


package com.quantitymeasurement.enums;


public enum Units {
    FEET(12,"Length"),
    INCH(1,"Length"),
    YARD(36,"Length"),
    CentiMeter(0.4,"Length"),
    MILI_LITRE(0.001,"Volume"),
    LITRE(1,"Volume"),
    GALLON(3.78,"Volume"),
    KILO_GRAM(1,"Weight"),
    GRAM(0.001,"Weight"),
    TONNE(1000,"Weight"),
    FARENHEIT(1,"Temperature"),
    CELSIUS(33.8,"Temperature");


    public double unit;
    public String quantityType;

    Units(double unit,String quantityType){
        this.unit=unit;
        this.quantityType=quantityType;
    }

}
