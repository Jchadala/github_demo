package org.cap.demo;

public class MainClass {
public static void main(String[] args)
{
	Account acc=new Account();
	acc.deposit();
	greetings();
}

private static void greetings() {
	// TODO Auto-generated method stub
	System.out.println("My bank is Citi");
}
}
