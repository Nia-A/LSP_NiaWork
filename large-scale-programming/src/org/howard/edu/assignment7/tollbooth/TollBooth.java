package org.howard.edu.assignment7.tollbooth;

/**
 * 
 * @author niaanderson
 * Tollbooth interface is created
 */
interface TollBooth {
   public void dataDisplayed();
   public void tollCalculator(Truck truck);
}

//Truck interface is created. This is implemented by TruckOne
interface Truck {
   public int numOfAxles();
   public int totalWeight();
	}

// Tolling class implements the specified interface TollBooth
class Tolling implements TollBooth {
	Tolling(){
		trucksSinceReceiptCollection = 0;
		receipts = 0;
	}
	
/**
 * tollCalculator calculates the total toll based on axle number and weight of trucks
 */
public void tollCalculator(Truck truck){
	int axles = truck.numOfAxles();
	int weight = truck.totalWeight();
	int amountOwed = 5 * axles + ((weight/1000)/2);
	
	System.out.println("This truck has: "+ axles+ " axles");
	System.out.println("This truck weighs: "+ weight + "kg" );
	
	trucksSinceReceiptCollection = trucksSinceReceiptCollection + 1;
	receipts = receipts + amountOwed;
	
	System.out.print("Total toll cost for this truck is "+ trucksSinceReceiptCollection + " : ");
	System.out.println(amountOwed);
	}

/**
 * Displays the data so that one can see all of the totals so far
 */
public void dataDisplayed(){
	System.out.println("The total amount of trucks that passed the toll is: " + trucksSinceReceiptCollection);
	System.out.println("The total receipts when "+trucksSinceReceiptCollection + " trucks have passed the toll :" + receipts);
	}

	int receipts;
	int trucksSinceReceiptCollection;
   }

class truckOne extends Tolling implements Truck {
	/**
	 * 
	 * @param axles displays number of axles
	 * @param weight displays weight
	 */
	truckOne(int axles, int weight){
		this.axles = axles;
		this.weight = weight;
	}
	
public int numOfAxles(){
       return axles;
   }

public int totalWeight(){
       return weight;
   }

	int axles;
	int weight;
}

