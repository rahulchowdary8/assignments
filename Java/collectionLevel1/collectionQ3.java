import java.util.ArrayList;
//import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
//import java.io.*;

class employee
{
	int id;
	String name;
	String dept;
	int salary;
	public employee(int id,String name,String dept,int salary) 
	{
		this.id=id;
		this.dept=dept;
		this.name=name;
		this.salary=salary;
	}
}
	class nameComparator implements Comparator<employee>
	{
	    public int compare(employee s1,employee s2)
	    {
	        return s1.name.compareTo(s2.name);
	    }
	}
	class idComparator implements Comparator<employee>
	{
	    public int compare(employee s1,employee s2)
	    {
	        return s1.id-(s2.id);
	    }
	}
	class salaryComparator implements Comparator<employee>
	{
	    public int compare(employee s1,employee s2)
	    {
	        return s1.salary-(s2.salary);
	    }
	}
	class deptComparator implements Comparator<employee>
	{
	    public int compare(employee s1,employee s2)
	    {
	        return s1.dept.compareTo(s2.dept);
	    }
	}
public class collectionQ3 {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			//Set<employee> set=new TreeSet<>();
			List<employee> list1 =new ArrayList<employee>();
			list1.add(new employee(1, "cha", "cse", 1000));
			list1.add(new employee(2, "on jo", "ece", 200));
			list1.add(new employee(3, "nam ra", "bece", 1200));
			list1.add(new employee(0, "bong yi", "aece", 1100));
			System.out.println("Choose id:1 Name:2 Dept:3,salary:4");
			int t=sc.nextInt();
			if(t==1)
			{
				//Collections.sort((List<>) list1);
				Set<employee> set=new TreeSet<employee>(new idComparator());
				set.addAll(list1);
				for(employee ele: set)
			    {
			        System.out.print(ele.id+" "+ele.name+" "+ele.dept+" "+ele.salary);
			        System.out.println();
			    }
			}
			else if(t==2)
			{
				TreeSet<employee> set=new TreeSet<employee>(new nameComparator());
				set.addAll(list1);
				for(employee ele: set)
			    {
			        System.out.print(ele.id+" "+ele.name+" "+ele.dept+" "+ele.salary);
			        System.out.println();
			    }
				
			}
			else if(t==3)
			{
				TreeSet<employee> set=new TreeSet<employee>(new deptComparator());
				set.addAll(list1);
				for(employee ele: set)
			    {
			        System.out.print(ele.id+" "+ele.name+" "+ele.dept+" "+ele.salary);
			        System.out.println();
			    }
			}
			else if(t==4)
			{
				TreeSet<employee> set=new TreeSet<employee>(new salaryComparator());
				set.addAll(list1);
				for(employee ele: set)
			    {
			        System.out.print(ele.id+" "+ele.name+" "+ele.dept+" "+ele.salary);
			        System.out.println();
			    }
			}
			else
			{
				System.out.println("INVALID NUMBER");
				System.out.println("ENTER ONLY 1 2 3 4");
			}
			//set.addAll(list1);
		}
		
		
	}

}
