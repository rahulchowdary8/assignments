package Todobusiness;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class todobusinessimplTest {

	@Test
	void test() {
		todoservice todoserivestub=new todoservicestub();
		todobusinessimpl todoservicebusiness=new todobusinessimpl(todoserivestub);
		List<String> filtered=todoservicebusiness.retrivetodosrelatedtoSpring("Dummy");
		assertEquals(2, filtered.size());
	}
	@Test
	@Disabled
	void testmock() {
		todoservice todoserivemock=mock(todoservice.class);
		List<String> list=Arrays.asList("Learn Spring","Learn Spring MVC","learn mockito");
		when(todoserivemock.retrivetodos("Dummy")).thenReturn(list);
		todobusinessimpl todoservicebusiness=new todobusinessimpl(todoserivemock);
		List<String> filtered=todoservicebusiness.retrivetodosrelatedtoSpring("Dummy");
		assertEquals(2, filtered.size());
	}
	@Test
	void listtest()
	{
		List mocklist=mock(List.class);
		when(mocklist.size()).thenReturn(2);
		assertEquals(2, mocklist.size());
	}

}
