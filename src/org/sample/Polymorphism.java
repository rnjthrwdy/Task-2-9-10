package org.sample;

public class Polymorphism extends Distance {
public void empId(int id) {
	System.out.println("no is"+id);
}	
public void empId(int no,String name) {
	System.out.println(no+" "+name);
}		
public void empId(int pn,String date,long phno) {
	System.out.println(pn+" "+date+" "+phno);

}

}
