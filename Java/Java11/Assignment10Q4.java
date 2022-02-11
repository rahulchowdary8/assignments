import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Assignment10Q3 {

	public static void main(String[] args) {
		String a = "A quick brown fox jumps over the lazy dog";
		ArrayList<String> list = new ArrayList<>(Arrays.asList(a.split(" ")));
		
		
		String b[] = list.toArray(size->new String[size]);
		System.out.println(Arrays.toString(b));
		
		}
	}
