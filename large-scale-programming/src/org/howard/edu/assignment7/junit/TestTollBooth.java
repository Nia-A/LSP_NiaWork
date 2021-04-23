package org.howard.edu.assignment7.junit;
import org.howard.edu.assignment7.TollBooth;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestTollBooth{
	public static void main(String [] args){
	Tolling booth = new Tolling();
	truckOne Toyota = new truckOne(5,12000);
	truckOne Tesla = new truckOne(2,5000);
	truckOne Chevy = new truckOne(6,17000);
	assertEquals(booth.tollCalculator(Toyota));
	booth.dataDisplayed();

	booth.tollCalculator(Tesla);
	booth.dataDisplayed();

	booth.tollCalculator(Chevy);
	booth.dataDisplayed();
}


@Test
@DisplayName("Test cases for Toyota Truck")
public void ToyotaTest() {
	
	truckOne Toyota = new truckOne(5,12000);
	truckOne Tesla = new truckOne(2,5000);
	truckOne Chevy = new truckOne(6,17000);
	assertEquals(booth.tollCalculator(Toyota), "Total toll cost for this truck is: ")
	
	}}