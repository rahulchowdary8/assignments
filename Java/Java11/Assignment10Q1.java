import java.util.Scanner;

public class Assignment10Q1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		var a = s.nextInt();
		var b = s.nextInt();
		var c = s.nextInt();
		
		SI simple = (var p,var t,var r)->{
			System.out.print("The simple intrest is ");
			return (p*t*r)/100;
		};
		System.out.print(simple.intrest(a,b,c));
	}
}


@FunctionalInterface
interface SI{
	int intrest(int P,int T,int R);
}
