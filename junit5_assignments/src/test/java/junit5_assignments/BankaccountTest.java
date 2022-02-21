package junit5_assignments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankaccountTest {
	Bankaccount bank;
	@BeforeEach
	void initeach()
	{
		bank=new Bankaccount();
	}
	@Test
	void testcase1()
	{
		
		int real;
		try {
			real = bank.withdraw(1000, 200);
			int excepted=200;
			assertEquals(excepted, real,real+"equal"+excepted);
		} catch (insufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	void testcase2()
	{
		
		//int real=bank.withdraw(1000, 2000);
		//int excepted=insufficientBalanceException;
		assertThrows(insufficientBalanceException.class, ()->bank.withdraw(1000, 2000));
	}

}
