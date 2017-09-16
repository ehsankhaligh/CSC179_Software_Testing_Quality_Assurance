import static org.junit.Assert.*;
import org.junit.Before;import org.junit.Test;


public class testMyTriangle { 
	
	Triangle myTriangle;
	
@Before /** Setup method executed before each test */ 
    public void setup() {

	     myTriangle = new Triangle(10, 10, 10); }

@Test 
    public void testEquilateral() {
	
	     assertEquals(myTriangle.classify(), "equilateral"); 
	}
}