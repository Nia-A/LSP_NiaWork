package org.howard.edu.lsp.exam.question40;

/**
 * 
 * @author niaanderson
 * Contains class Tiger which is an animal.
 * Displays text when the tiger moves or speaks
 */
public class Tiger implements Animal{

	@Override
	public void move() {
	System.out.println("This Tiger moves forward");
	}

	@Override
	public void speak() {
	System.out.println("This Tiger speaks");
	}
  
}

