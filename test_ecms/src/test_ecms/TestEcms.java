package test_ecms;

@FunctionalInterface
interface Intera
{
	public void m1();
	default void m2(int a, int b)
	{
		int c = a+b;
	}
	public static void m3()
	{
		
	}
}

@FunctionalInterface
interface intera1
{
	public int subtract(int input, int input2);
	//public void m2();
	
}

@FunctionalInterface
interface Calcu
{
	public void switchOn();
}

public class TestEcms {

	/*
	 * @Override public void switchOn() { // TODO Auto-generated method stub
	 * System.out.println("Switch ON");
	 * 
	 * }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello Java World!!!");
		System.out.println("this is my second commit");
		
		System.out.println("3 commit");
		
		
		//TestEcms c= new TestEcms();		
		//c.switchOn();
		//Intera m1 ()-> System.out.println("Hello");
		
		
		
		Calcu cal=() -> {  System.out.println("Switch ON using Lambad"); };
		cal.switchOn();
		
		
		Intera intr=() -> System.out.println("this is Intera functional interface M1 Method call");
		intr.m1();
		
	
	//below one way to write lamda exp	
		/*	intera1 it1 = (input, input2) -> {return input-input2;};
		System.out.println(it1.subtract(10, 5));
		*/
	
		//intr = (1,2) -> System.out.println("hell");
		
		
		// below is second way to write lamda exp
		
		intera1 it1 = (input, input2) -> input-input2;System.out.println(it1.subtract(10, 5));
		
		
		
		// ()   ->   {body};
		
		System.out.println("This is work space1");
		System.out.println("This is work space1");
		
		System.out.println("Workspace 14 June");
	}

	


}
