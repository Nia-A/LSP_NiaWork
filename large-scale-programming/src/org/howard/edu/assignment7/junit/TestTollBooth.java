package org.howard.edu.assignment7.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTollBooth {
public static void main(String [] args)
   {
Tolling booth = new Tolling();
truckOne Toyota = new truckOne(5,12000);
truckOne Tesla = new truckOne(2,5000);
truckOne Chevy = new truckOne(6,17000);
booth.tollCalculator(Toyota);
booth.dataDisplayed();

booth.tollCalculator(Tesla);
booth.dataDisplayed();

booth.tollCalculator(Chevy);
booth.dataDisplayed();
}
}