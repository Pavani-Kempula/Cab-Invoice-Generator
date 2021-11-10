package com.bridgelabz.cabinvoicegenerator;

import com.bridgelabz.cabinvoicegenerator.CabInvoiceGenerator;
import org.junit.Assert;
import org.junit.Test;

/****************************************************
 * @author Pavani
 *
 * This is a test case class.
 * This class holdes all the related test cases that,
 * test all the methods od the project.
 * **************************************************/

public class CabInvoiceGeneratorTest {
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double distance = 5.0;
        double time = 2;
        double totalfare =  cabInvoiceGenerator.getfare(distance,time);
        Assert.assertEquals(52, totalfare,0.0);
    }

    @Test
    public void givenDistanceAndTime_WhenLessThanMinimumFare_ShouldReturnTotalFare() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double distance = 0.1;
        double time = 2;
        double totalfare =  cabInvoiceGenerator.getfare(distance,time);
        Assert.assertEquals(5, totalfare,0.0);
    }
}