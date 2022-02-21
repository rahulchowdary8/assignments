package junit5_assignments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class findminmaxTest {
	findminmax f1;
	
	@BeforeEach
	void initeach()
	{
		f1=new findminmax();
			
	}
	@AfterEach
	void after()
	{
		System.out.println("TEST CASE PASSED");
	}
	@Test
	void testcase1()
	{
		int array[]= {1,2,3,4,5,6,7,8,9,10};
		int realarr[]=f1.findMinMax(array);
		int exceptarr[]= {1,10};
		assertArrayEquals(exceptarr, realarr,"returns min and max"+exceptarr+realarr);
	}
	@Test
	void testcase2()
	
	{
		int array[]= {10,30,70,60,101,202,5};
		int realarr[]=f1.findMinMax(array);
		int exceptarr[]= {5,202};
		assertArrayEquals(exceptarr, realarr,"returns min and max"+exceptarr+realarr);
		
	}
	@Test
	void testcase3()
	{
		int array[]= {20,30,40,70,80,200,500};
		int realarr[]=f1.findMinMax(array);
		int exceptarr[]= {20,500};
		assertArrayEquals(exceptarr, realarr,"returns min and max"+exceptarr+realarr);
		
	}
	@Nested
	@DisplayName("2QUESTION_find-min")
	class findmin
	{
		@Test
		void testcase1()
		{
			int array[]= {20,30,40,70,80,200,500};
			int min=f1.findMin(array);
			int ex=20;
			assertEquals(ex, min,"returns min");
		}
		@Test
		void testcase2()
		{
			int array[]= {10,30,70,60,101,202,5};
			int min=f1.findMin(array);
			int ex=5;
			assertEquals(ex, min,"returns min");
		}
	}
	@Nested
	@DisplayName("2QUESTION_find-max")
	class findmax
	{
		@Test
		void testcase1()
		{
			int array[]= {20,30,40,70,80,200,500};
			int max=f1.findMax(array);
			int ex=500;
			assertEquals(ex, max,"returns max");
		}
		@Test
		void testcase2()
		{
			int array[]= {10,30,70,60,101,202,5};
			int max=f1.findMax(array);
			int ex=202;
			assertEquals(ex, max,"returns max");
		}
	}
	
}
