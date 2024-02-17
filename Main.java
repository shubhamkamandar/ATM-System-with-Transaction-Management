import java.util.*;
//import java.util.concurrent.TimeUnit;
public class Main  
{  
    
    public static void main(String args[] )  
    {  
       
        int balance = 100000, withdraw, deposit;  
          
        Scanner sc = new Scanner(System.in);    
        while(true)  
        {  
            System.out.println("Welcome to Automated Teller Machine(ATM)");  
            System.out.println("Choose 1 for Withdraw");  
            System.out.println("Choose 2 for Deposit");  
            System.out.println("Choose 3 for Check Balance");  
            System.out.println("Choose 4 for EXIT");  
            System.out.print("Choose the operation you want to perform:");  
              
            //get choice from user  
            int choice = sc.nextInt();
        
            if(choice==1 || choice==2 || choice==3 || choice==4)
            {
                switch(choice)  
                {  
                    case 1:  
                        System.out.print("Enter money to be withdrawn:");  
                        
                        
                        withdraw = sc.nextInt();  
                        
                        //check whether the balance is greater than or equal to the withdrawal amount  
                        if(balance >= withdraw)  
                        {  
                            
                            balance = balance - withdraw;  
                            System.out.println("Please collect your money"); 
                            
                        }  
                        else  
                        {  
                            //show custom error message   
                            System.out.println("Insufficient Balance");  
                        }  
                        System.out.println("");
                        try {
                            // Sleep for 1 seconds
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;  
    
                    case 2:  
                        
                        System.out.print("Enter money to be deposited:");  
                                    
                        //get deposite amount from te user  
                        deposit = sc.nextInt();  
                                    
                        //add the deposit amount to the total balanace  
                        balance = balance + deposit;  
                        System.out.println("Your Money has been successfully depsited");  
                        System.out.println("");  
                        try {
                            // Sleep for 1 seconds
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;  
    
                    case 3:  
                        //displaying the total balance of the user  
                        System.out.println("Balance : "+balance);  
                        System.out.println("");  
                        try {
                            // Sleep for 1 seconds
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;  
    
                    case 4:  
                        //exit from the menu  
                        System.out.println("Thank You!!!");
                        System.exit(0);  
                }
            }
            else
            {
                System.out.println("Plz Choose the Correct Number");
                System.exit(0);
            }  
        }  
    }  
} 




//Run the Program in Terminal
//javac Main.java
//java Main