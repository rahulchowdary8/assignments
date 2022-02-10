interface Airthmetic{
	int Opr(int a,int b);
}
public class Assignment4Q1 {
	public static double addition(int num1,int num2){
		Airthmetic addition= (a, b)-> a+b;
		return (addition.Opr(num1, num2));
		}
    public static  double subtraction(int num1,int num2){
    	Airthmetic Subtraction=(a,b)->a-b;
		return (Subtraction.Opr(num1, num2));
    	
    }
    public static double multiplication(int num1,int num2){
    	Airthmetic multiplication=(a,b)-> a*b;
    	return (multiplication.Opr(num1, num2));
    }
    public static double division(int num1,int num2){
    	Airthmetic  division=(a,d)->a/d;
		return (division.Opr(num1, num2));
    	
    }
    public static void main(String[]args) {
    	System.out.println("Addtion of 13 & 5 :->");
    	System.out.println(addition(13,5));
    	System.out.println("Subtraction of 13 & 5 :->");
    	System.out.println(subtraction(13,5));
    	System.out.println("multiplication of 13 & 5 :->");
    	System.out.println(multiplication(13,5));
    	System.out.println("division of 13 & 5 :->");
    	System.out.println(division(10, 5));
    }

}
