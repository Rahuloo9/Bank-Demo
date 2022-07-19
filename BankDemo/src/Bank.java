import java.util.Scanner;

class demo{
	
	private int total_blnc=10000;
	private int  password=12345;
	
	Scanner sc=new Scanner (System.in);
public void  deposit() {
	int deposit_money;
	 int pass;
	System.out.println("Enter  Password ");
	pass=sc.nextInt();
	if(pass==password) {
		System.out.println("Enter Deposit Amounts ");
		
		deposit_money=sc.nextInt();
		
		total_blnc =total_blnc+deposit_money;
		System.out.println("Total Amounts = "+total_blnc);
	}else {
		System.out.println("Password invalid.....! ");
	}
	
	
}
public void withdraw() {
	int withdraw_money;
	 int pass;
	System.out.println("Enter  Password ");
	pass=sc.nextInt();
	if(pass==password) {
		System.out.println("Enter withdraw Amounts ");
		
		withdraw_money=sc.nextInt();
		
		total_blnc =total_blnc-withdraw_money;
		System.out.println("Total Amounts = "+total_blnc);
	}else {
		System.out.println("Password invalid.....! ");
	}
	
	
}
public void  TotalBalncs() {
	 int pass;
	System.out.println("Enter  Password ");
	pass=sc.nextInt();
	if(pass==password) {
		System.out.println("Total  Amounts = "+total_blnc);
		
	}else {
		System.out.println("Password invalid.....! ");
	}
	
	
}
	
public void  Bank_Details() {
	
	System.out.println(" WELCOME TO THE HDFC BANK INDORE.....! ");
	
}	
}




public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
   demo d=new demo();
   d.Bank_Details();
   
   Scanner sc2=new Scanner(System.in);
   
   
   System.out.println(" Enter Your Choices Option .. ");
   
   System.out.println(" 1. DEPOSIT.. ");
   System.out.println(" 2. WITHDRWAL.. ");
   System.out.println(" 3. BALNCE INQUIRY.. ");
   
   int ch;
   
   ch=sc2.nextInt();
   
   switch(ch) {
   
   case 1:
	   d.deposit();
   break;
   
   case 2:
	   d.withdraw();
   break;
   
   case 3:
	   d.TotalBalncs();
	   break;
	   
	   default:
		   System.out.println("Invlid Number ");
	   
   }
		
	}

}
