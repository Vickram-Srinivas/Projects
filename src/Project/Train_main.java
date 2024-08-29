package Project;

 import java.util.Scanner;

 public class Train_main {
 static boolean b; static int  select;
 int option;
 Train_main(user_login login){
	super();
	boolean r=login.t;
	
  //public void display() {
	if(r==true) 
	{
		do {
	 Scanner s=new Scanner(System.in);
	 System.out.println("\033[1mSelect the trains: "+"\n"+" 1.Hyd-Viz"+"\n"+" 2.Hyd-Chennai"+"\n"+" 3.Delhi-Hyd\033[0m");
	  select=s.nextInt();
	 
	 //System.out.println(i);
	  switch(select) {
	  case 1:
		  train_1 t1=new train_1(null);
		//  train_1 t12=new train_1(null);
	  break;
	  case 2:
		  train_2 t2=new train_2(null);
		  break;
	  case 3:
		  train_3 t3=new train_3(null);
		  break;
		  default:
			  System.out.println(" Invalid try again");
			  break;
	  }
	  System.out.println(" Select the following options for continue/close!"+"\n"+" 1.Continue"+"\n"+" 2. Close");
	   option = s.nextInt();
	  if(option==2)
		  break;
	  
// }
		}

      	while(option==1);
	if(option==2) {
		System.out.println(" App closed");
	}
	
}
	else  {
		System.out.println(" Invalid");
	}
	
}
 
	public static void main(String[] args) {
		System.out.println("\033[1mWelcome to Ryugs's  Train booking App (^_^)\033[0m"+"\n");
		user_login login=new user_login();
		login.Login_display();
		//user_details details = new user_details();
//		details.user_display();
			Train_main book=new Train_main(login);
			
	
		//tr.display();
		
		
	}

}
