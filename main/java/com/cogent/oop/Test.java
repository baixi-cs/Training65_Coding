package com.cogent.oop;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		
		int res1 = c.getAdd(30, 20, 10);
		int res2 = c.getMinus(30,20, 10);
		int res3 = c.getMult(1, 2, 4);
		int res4 = c.getDiv(60, 3, 2);
		float res5 = c.getFloatResult(1.1f, 2.2f);
		System.out.println("res1"+res1 +"res2"+ res2+"res3"+res3+"res4"+res4);
		System.out.println(res5);
		
		c.display();
		
		System.out.println("----------------------------");
		BankApp bankapp = new BankApp();
		bankapp.balance = 1000;
		bankapp.depositAmout(500.00f);
		bankapp.withdrawAmout(200.00f);
		bankapp.showAmout();
		
		Employee e1 = new Employee();
		Employee e2 = new Employee(15, "alan", "HR", 5000f);
		Employee e3 = new Employee(102, "andy", "IT", 6000f);
		Employee e4 = new Employee();
		e1.addEmp(5, "alex");
		e1.delEmp(102, "andy", "IT", 6000);
		
		e2.displayEmp();
		e3.updateEmp(7500f);
		
		e4.addEmp(24, "anna");
		e4.updateEmp(5500f);
		
		
		
	}

	@Override
	public String toString() {
		return "Test [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
