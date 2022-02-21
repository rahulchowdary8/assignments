package Todobusiness;

import java.util.Arrays;
import java.util.List;

public class todoservicestub implements todoservice {

	@Override
	public List<String> retrivetodos(String user) {
		
		return Arrays.asList("Learn Spring","Learn Spring MVC","learn mockito");
	}

}
