package org.howard.edu.lsp.exam.question40;

/**
 * 
 * @author niaanderson
 * Contains class Goose which is an Animal.
 * Displays text when the Goose moves, speaks, or flies 
 */
public class Goose extends Flying implements Animal {
	

		@Override
		public void move() {
		System.out.println("This goose moves forward");
		}

		@Override
		public void speak() {
		System.out.println("This goose speaks");
		}
		  
		public void fly(){
		System.out.println("This goose is flying high");
		}
		  
		}


