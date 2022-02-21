package Todobusiness;

import java.util.ArrayList;
import java.util.List;

public class todobusinessimpl {
	todoservice todo_service;

	public todobusinessimpl(todoservice todo_service) {
		super();
		this.todo_service = todo_service;
	}
	public List<String> retrivetodosrelatedtoSpring(String user)
	{
		List<String> filtertedlisttodos=new  ArrayList<String>();
		List<String> todos=todo_service.retrivetodos(user);
		for (String s : todos) {
			if(s.contains("Spring"))
			{
				filtertedlisttodos.add(s);
			}
			
		}
		
		return filtertedlisttodos;
		
	}

}
