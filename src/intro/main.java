package intro;
import java.lang.System;
import java.util.Scanner;


class Solution {
	String fname;
	String lname;
	String firstname;
	String lastname;
	public Solution(String fname, String lname, String firstname,String lastname){
		this.fname = fname;
		this.lname = lname;
		this.firstname = firstname;
		this.lastname = lastname;
		System.out.println(fname + " " + lname + " <"+firstname.replaceAll(" ", "")+"." +  lastname +"@example.com"+">");	
	}
}

public class main {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
	String[] firstName = {"John ","Peter Benjamin","Mary Jane", "John Elvis", "John Evan","Jane ", "Peter Brain"};
	String[] lastName = {"Doe","Parker","Watson-Parker", "Doe","Doe","Doe","Parker"};
	
	 for (int i = 0; i < firstName.length; i++) {
		 
		 Solution p1 = new Solution(firstName[i],lastName[i], firstName[i].toLowerCase(),lastName[i].toLowerCase());
		 System.out.println("Hello");
		
	 }
	
   }

}
