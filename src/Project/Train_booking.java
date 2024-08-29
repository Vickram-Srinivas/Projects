package Project;

import java.util.Scanner;

public class Train_booking {
	int option;  int ticket=0;  int seats=5; int temp2=0; int rebook; int temp=ticket;
	

	Train_booking(user_login login){
		super();
		boolean r=login.t;
 /*  String name1=details.name;
   String phone_number1=details.phone_number;
   int age1=details.age;                                  user_details details
   String gender1=details.gender;
   String alt_ph_num1=details.alt_ph_num;*/
	
	
	//void Booking() {
	if(r==true) {
		seats=5;
	int rebook=seats;
	do
	{
		Scanner s=new Scanner(System.in);
	System.out.println("(^_^) Select the options"+"\n"+"1. Book the ticket"+"\n"+"2. Ticket status"+"\n"+"3. Ticket details"+"\n"+"4. Seats");
	int selection=s.nextInt();
	switch(selection)
	{
	case 1:{
		if(rebook<5&&rebook!=0)
		{
		System.out.println("entet the no of seats");
			  ticket=s.nextInt();
			seats=rebook;
			System.out.println("booked "+ticket);
			  rebook=(seats-ticket);
	//	System.out.println("remaning seats "+rebook);
	seats=rebook;
	//System.out.println(seats+" "+"rebook"+ rebook);
			//System.out.println(rebook);
			System.out.println(" reamning seats "+seats); break;
		}
	        	
		else if(rebook==0) {
	     		System.out.println("we are out of tickets");
	     		break;
	     	}
	 if(seats==5&&seats!=0) 
	 System.out.println("entet the number of seats");
	  ticket=s.nextInt();
temp=ticket;
          if(ticket>5) {
				System.out.println(" (-_-) Sorry! Invalid input plesae try again");
			}
          else {
	  System.out.println("booked "+ticket);
	  rebook=(seats-ticket);
System.out.println("remaning seats "+rebook);
seats=rebook;
System.out.println("Seats "+seats +" "+"rebook "+ rebook);
	 }
	}
	break;
	case 2:{
		train_1 t1=new train_1(null);
		train_2 t2=new train_2(null);
		train_3 t3=new train_3(null);
	}
	break;
	case 3:
		if(rebook==seats) {
		System.out.println("Booked "+ticket+" tikcets");}
		else {
			System.out.println("Booked "+(temp+ticket)+" tickets");
			break;
		}
		break;
	case 4:{
		if(rebook!=0) {
			System.out.println("Availabile seats: "+rebook);
        	}
        	else if(rebook==0) {
        		System.out.println("No tickets");
        	}
		break;}
		default:
		System.out.println("Invaild selection please select again");
	}
	
		System.out.println("Select the following options for continue/close!"+"\n"+"1.Continue"+"\n"+"2. Close");
 option=s.nextInt();
 if(option==2)
	break;
	}
	
      	while(option==1);
	if(option==2) {
		System.out.println("Thank you for visiting the Ryuga's train booking site!"+"\n"+"(^_^) Visit again.");
	}
	}
	else {
		System.out.println("Invalid");
	}
	
	}
	
	

	public static void main(String[] args) {
	
		System.out.println("Welcom to Ryugs's  Train booking site(^_^)"+"\n");
		user_login login=new user_login();
	login.Login_display();
	//user_details details = new user_details();
//	details.user_display();
		Train_booking book=new Train_booking(login);
		
	
		
	//book.Booking();
			
	}

}
