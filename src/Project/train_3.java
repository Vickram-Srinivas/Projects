package Project;

import java.util.Scanner;

public class train_3 { //delhi-hyd
	static int i1;
	int ticket=0;  int seats=15; int temp2=0; int rebook; int temp=ticket; int option;  int reticket; int price=200;
	String name; long phone_num; short age; String Emailid; int count;
	train_3(Train_main tr) {
		int i1=tr.select; 
   //	System.out.println(tr.i);
	//System.out.println(i1);
		
	if(i1==3) 
	{
		//void display() {
		seats=15;
		int rebook=seats;
		do
		{
			Scanner s=new Scanner(System.in);	
		System.out.println("(^_^) Select the options"+"\n"+" 1. Book the ticket"+"\n"+" 2. Ticket status"+"\n"+" 3. Train details"+"\n"+" 4. Seats");
		int selection=s.nextInt();
		
		switch(selection)
		{
		case 1:{
		 if(seats==15&&seats!=0) {
			 System.out.println(" Enter the number of travellers");
		       count=s.nextInt();
		//	 for(int i=1;i<=count;i++) {}
			 System.out.println(" Enter the traveller deatils");
			System.out.println(" Name:"+"\n"+" Phone number:"+"\n"+" Age:"+"\n"+" Email id:");
		String t_name=s.next(); long ph_num=s.nextLong(); short Age=s.nextShort(); String emailid=s.next();	
		name=t_name;  phone_num=ph_num; age=Age; Emailid=emailid;
			 
		 System.out.println(" Enter the number of seats");
		  ticket=s.nextInt();
	temp=ticket;
	          if(ticket>15) {
					System.out.println(" (-_-) Sorry! Invalid input plesae try again");
				}
	          else {
	  System.out.println(" Ticket price: "+ticket*price);
		  System.out.println(" Booked ["+ticket+"] seats");
		  rebook=(seats-ticket);
	//System.out.println("remaning seats "+rebook);
	seats=rebook;
	//System.out.println("Seats "+seats +" "+"rebook "+ rebook);
		 }
	          break;
		 }
		 
		 System.out.println(" Entet the no of seats");
		  ticket=s.nextInt();
	          if(ticket<=rebook&&rebook!=0)
				{
				   seats=rebook;
					System.out.println(" Booked "+ticket);
					System.out.println("Price: "+ticket*price);
					  rebook=(seats-ticket);
			//	System.out.println("remaning seats "+rebook);
			seats=rebook;
			//System.out.println(seats+" "+"rebook"+ rebook);
					//System.out.println(rebook);
					System.out.println(" Reamning seats "+seats); break;
				}
				else if(ticket>rebook) {
					System.out.println(" We are low in tickets"); break;	
			}
				else if(rebook==0) {
		     		System.out.println(" We are out of tickets");
		     		break;}
		}
		
		break;
		case 2:{
		while(ticket<=15&&ticket!=0) {		
			System.out.println(" Name: "+name+"\n"+" Phone_number: "+ phone_num+"\n"+" Age: "+age+"\n"+" Email id: "+Emailid);
			System.out.println(" ticket price: "+ticket*price);
		
			break;}
		
		reticket=reticket+ticket;
		
		if(reticket!=0) {
			System.out.println(" Total booked tickets: "+reticket);
		}
		if(ticket==0) {
			System.out.println("Not booked");
		}
		}
		break;
		case 3:
			System.out.println(" EAST COAST EXP");
			System.out.println(" Train number: 18046");
			System.out.println(" Time:08:30 - 21.30 (12h 40m)");
			System.out.println(" Secunderabad Junct (SC)-Visakhapatnam Junc (VSKP)");
			System.out.println(" Availabile on Mon Tue Wed Thru Fri Sat Sun"+"\n");
			break;
		case 4:{
			if(rebook!=0) {
				System.out.println(" Price of each ticket: "+price);
				System.out.println(" Availabile seats: "+rebook);
	        	}
	        	else if(rebook==0) {
	        		System.out.println(" No tickets");
	        	}
			break;}
		
			default:
			System.out.println( "Invaild selection please select again");
		}
		
			System.out.println("  Select the following options for continue/close!"+"\n"+" 1.Continue"+"\n"+" 2. Close");
	 option=s.nextInt();
	 if(option==2)
		break;
		}
		
	      	while(option==1);
		if(option==2) {
			System.out.println("    Thank you for visiting the Ryuga's train booking !"+"\n"+" (^_^) Visit again."+"\n");
		}
	//}
		}
	}

	public static void main(String[] args) {
		
		//train_3 t3=new train_3();
		//t3.display();
	}

}
