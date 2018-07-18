
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.niit.bank.Bankaccount;
import java.util.Scanner;
public class Account {
     public static void main(String[] args){
     char c1;//for continue yes or no
     Double bal;//availabl balance
     int wbalance,dbalance;//input for withdraw and deposit amount
     Bankaccount b=new Bankaccount(100.00);
    Scanner sc=new Scanner(System.in);
    do
    {
    System.out.println("1. withdrawl");
    System.out.println("2. deposit");
    System.out.println("choose option");
    int ch=sc.nextInt();//variable for switch cases
    switch(ch)
    {
        case 1: System.out.println("enter withdrwal amount");
                 wbalance=sc.nextInt();
                 b.withdrawl(wbalance);//method for withdrawal in bankaccount
                
                break;
        case 2 :System.out.println("enter deposit amount"); 
                dbalance=sc.nextInt();
                b.deposit(dbalance);//method for deposit in bankaccount
                break;
        
    }
    System.out.println("do you want to continue - yes/no");
     c1=sc.next().charAt(0);
            }
    while(c1!='n');
   b.display();
    }
}