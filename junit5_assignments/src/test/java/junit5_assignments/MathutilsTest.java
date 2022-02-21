package junit5_assignments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathutilsTest {

	Mathutils math;
	@BeforeAll
	 static void initall()
	{
		System.out.println("ADDING TESTCASES FOR MATHUTILS");
	}
	@AfterAll
	static void initafterall()
	{
		System.out.println("DONE WITH TESTCASES");
	}
	@BeforeEach
	void initeach() 
	{
		math=new Mathutils();
	}
	@AfterEach
	void initaftereach()
	{
		System.out.println("TEST CASE PASSED");
	}

	@Test
	void testadd() {
		//Mathutils math=new Mathutils(); 
		int except=2;
		int real=math.add(1, 1);
		assertEquals(except, real,"THis performs add operation");
	}
	@Test
	void testsub() {
		assertEquals(2, math.subtract(4, 2),"THis performs sub operation");
	}

}
