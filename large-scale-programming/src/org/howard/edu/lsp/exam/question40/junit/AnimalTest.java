package org.howard.edu.lsp.exam.question40.junit;

import org.howard.edu.lsp.exam.question40.Airplane;
import org.howard.edu.lsp.exam.question40.Flying;
import org.howard.edu.lsp.exam.question40.Goose;
import org.howard.edu.lsp.exam.question40.Tiger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AnimalTest {

	@Test
	@DisplayName("Test cases for the goose")
	public void gooseTester() {
		
		//Goose object
		Goose goose = new Goose();
		  
		//checks the goose methods
		goose.move();
		goose.speak();
		goose.fly();
		  
		
	}
	
	@Test
	@DisplayName("Test cases for the tiger")
	public void tigerTester() {
		
		//Tiger object
		Tiger tiger = new Tiger();
		  
		//checks the tiger methods
		tiger.move();
		tiger.speak();
		  
		
	}
	
	@Test
	@DisplayName("Test cases for the plane and goose")
	public void planeTester() {
		
		//Goose and airplane objects
		Goose goose = new Goose();
		Airplane airplane = new Airplane();
		  
		//checks airplane method
		airplane.fly();
		
		//stores bird and airplane as flying objects
		Flying item1 = goose;
		Flying item2 = airplane;
				  
		//checks the fly methods
		item1.fly();
		item2.fly();
	}
	
	

}
