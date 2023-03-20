package com.cogent.keyword;

public class Tesrt {
public static void main(String[] args) {
//		Emp e = new Emp(111, "alex",6000 );
		Emp e = new HrDept(112, "alan",7000, "it");//object referance
		HrDept d = new HrDept(111, "alex",6000, "CS");
		d.display();
		d.addEmp();
		d.toString();
		
		e.display();
		e.addEmp();
		e.toString();
		
		Shape s1 = new Circle("Red", 2.2);
        Shape s2 = new Rectangle("Yellow", 2, 4);
 
        System.out.println(s1.toString());
        System.out.println(s2.toString());
		
		Motor m = new Motor();
		m.show();
//		m.disp();
//		
	}

}
