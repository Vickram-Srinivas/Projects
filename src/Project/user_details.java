package Project;

import java.util.Scanner;

public class user_details {
	
  /*  user_details( user_login login){
	super();
	 String name1=login.R_name;
	   String phone_number1=login.Phone_number;
	//   int age1=login.age;
	   String gender1=login.Gender;
	 //  String alt_ph_num1=login.alt_ph_num;
	   
	   System.out.println(name1);
}*/
	String name; String  phone_number; int age;  String gender;String alt_ph_num;
public	void user_display() {
		Scanner s=new Scanner(System.in);
		System.out.println("eneter the name of the traveller");
		String name=s.next();
		System.out.println("enter the phone_number");
		String phone_number=s.next();
		System.out.println("enter the gender");
		String gender=s.next();
		System.out.println("enter the age");
		int age=s.nextInt();
		System.out.println("enter the alternate phone number");
		String  alt_ph_num=s.next();
		System.out.println("Name: "+name+"\n"+"phone_number: "+phone_number+"\n"+"Gender: "+gender+"\n"+"age: "+age+"\n"+"alternat phone number: "+alt_ph_num);
	
	}
	public static void main(String[] args) {
		user_login user=new user_login();
		user.Login_display();
		//	user_details r = new user_details(user);
//r.user_display();
		
	}
	}
