import java.util.ArrayList;
import java.util.Arrays;

public class CollectionQ3 {

	public static void main(String[] args)
	{

		String str = "A quick brown fox jumps over the lazy dog";

		String[] strSplit = str.split(" ");

		
		ArrayList<String> strList = new ArrayList<String>(Arrays.asList(strSplit));

		for (String s : strList)
			System.out.println(s);
	}
}
