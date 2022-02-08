import java.util.Date;
//import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class collectionQ4 {


	public static void main(String[] args) {
		
		List<Date> list1=new LinkedList<>();
		//date.getMonth();
		list1.add(new Date(2011,02,03));
		
		list1.add(new Date(2000,01,9));
		
		list1.add(new Date(2010,12,12));
		
		list1.add(new Date());
		
		for (Date date1 : list1) {
			int d1=date1.getMonth();
			System.out.println(date1);
			 if (((d1 % 4 == 0) && (d1 % 100!= 0)) || (d1%400 == 0))
			 {
				 System.out.println(date1.getMonth()+" it is Leap Year");
			 }
			 else
			 {
				 System.out.println(date1.getMonth()+" It is not A LeapYear");
			 }
		}

	}

}
