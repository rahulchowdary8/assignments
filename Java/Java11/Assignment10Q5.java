import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;


public class Assignment10Q5 {
	static int g=0;

	public static void main(String[] args) throws IOException {
		

		Path a=Paths.get("C:/","Users","Desktop","Price.txt");
		Path b=Paths.get("C:/","Users","Desktop","Total.txt");
		
	
		while(true)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter option");
		int o=sc.nextInt();
		
		if(o==3)
		{
			System.out.println("terminating operation");
			break;
		}
		if(o==2)
		{
		
			 String d1=Integer.toString(g);
			Files.writeString(b,d1,StandardOpenOption.CREATE);
			String g1=Files.readString(b);
			System.out.println("Total price:"+g1);
			continue;
							
		}	
		while(true)
		{
		if(o==1)
		{
			System.out.println("enter price:");
			String l=sc.next();
			g+=Integer.valueOf(l);
			Files.writeString(a,l,StandardOpenOption.APPEND);
			Files.writeString(a,"\n",StandardOpenOption.APPEND);
			System.out.println("yes/no");
			String s=sc.next();
			if(s.equals("no"))
			{
				break;
			}
		}
		}
	}
	}
}
