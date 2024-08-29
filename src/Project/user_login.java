package Project;

import java.util.Scanner;


public class user_login {
	 boolean t;  int retain;
	 
	void Login_display()
	{
		
	do
	{
		Scanner s=new Scanner(System.in);
   System.out.println(" Select the options"+"\n"+" 1. Register"+"\n"+" 2. Login");
     int option=s.nextInt();
      //String R_name=s.next(); int Phone_number=s.nextInt();String Gender=s.next(); String R_password=s.next();String R_username=R_name;
     switch(option){
    case 1:
     System.out.println(" Welcom to Register Page enter the details");
    System.out.println(" Name, Phone_number, Gender, password");
    String R_name=s.next(); String Phone_number=s.next();
    String Gender=s.next(); String R_password=s.next();String R_username=R_name;
 
     System.out.println("Name: "+R_name+"\n"+"Phone_number: "+Phone_number+"\n"+"Gender: "+Gender);
     int len=R_password.length(); 
     String star="*";
      System.out.println("Password: ");
      
        for(int i=1;i<=len;i++) {
	 System.out.print(star);
     }
      System.out.println("\n"+"Sucessfully registered");
      t=true;
      //System.out.println(t);
      break;
     // String L_username=R_username; String L_password=R_password;
      case 2:
	// L_username=R_username; L_password=R_password;
      System.out.println(" Enter the user name & psassword ");
    String username=s.next(); String password=s.next();
  
   String L_username="v"; String L_password="v";
 
    if(username.equals(L_username)&&password.equals(L_password)) {
	System.out.println("Login Sucessfully"); 
	t=true;
	//System.out.println(t);
  }
  else
  {
	System.out.println(" Invlaid username/password1! try again");
	t=false;
	//System.out.println(t);
  }
  break;
   default:
   System.out.println(" Invalid selection");
   break;
  }
   if(t==true) {
   System.out.println(" Select Home for Booking "+"\n"+" 1. Retry"+"\n"+" 2. Home"+"\n"+" 3. Close");
  retain=s.nextInt();
  if(retain==2)
  break;
   }
  else if(t==false) {
	 System.out.println(" 0.Retry");
	 retain=s.nextInt();
 }
 
  if(retain==3){
	  t=false;
	System.out.println("App closed");
	break;
 }
 
	}
	
  	  while(retain==1||retain==0);
 if(retain==2) {
	System.out.println("welcome to Home Page");
}
	}


	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String user_name11=s.next();
		 String Password11=s.next();
		 int i=s.nextInt();
	user_login user=new user_login();
	user.Login_display();
		
	}
}

