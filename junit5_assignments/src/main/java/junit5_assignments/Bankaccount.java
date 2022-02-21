package junit5_assignments;

class insufficientBalanceException extends Exception
{
	public insufficientBalanceException() {
		// TODO Auto-generated constructor stub
	}
	
	
	insufficientBalanceException(String s)
	{
		super(s);
	}
	}
public class Bankaccount {
	int d=0;
	public int withdraw(int bal,int draw) throws insufficientBalanceException
	{
		
			if(draw>bal)
			{
				throw new insufficientBalanceException("insufficient balance");
				
			}
			else 
			{
				return d+=draw;
			}
		
	}
	public static void main(String[] args) {
		Bankaccount b=new Bankaccount();
		try {
			int c=b.withdraw(1000, 200);
			System.out.println(c);
		} catch (insufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
