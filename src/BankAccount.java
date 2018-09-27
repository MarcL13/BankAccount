/**
 * 
 * @author Marc Lussier, Period 7
 *
 *
 */
public class BankAccount
{
	private String name;
	private int accNum;
	private double balance;
	
	
	
	public BankAccount(String name, int accNum)
	{
		name = "Marc Lussier";
		accNum=1;
	}
	
	public BankAccount(double balance)
	{
		balance = 0;
	}
	
	public void deposit(double amount1)
	{
		amount1 = 10.0;
		balance = balance + amount1;
	}
	
	public void withdraw(double amount2)
	{
		amount2 = 10.0;
		balance = balance - amount2;
		}
	
	public double getBalance()
	{
		return balance;
	}
	
	public String toString()
	{
		return name;
		return accNum;
		return balance;
	}
}
