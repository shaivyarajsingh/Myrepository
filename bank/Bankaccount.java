/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.bank;
public class Bankaccount { 
    int flag=-1;
    Double balance;
    public Bankaccount(Double balance){
        this.balance=balance;
    }
    //for checking successive transactions
     public void withdrawl(int withdraw_balance)
     {
         
          if(flag==1){
             balance=balance-(0.004*withdraw_balance+withdraw_balance); //for 2nd case of withdrawal
           
             
          }
          else{
          balance=balance-(0.005*withdraw_balance+withdraw_balance);//for 1st case of withdrawal
         
          }
          flag=0;
          
         }
   public void deposit(int deposit_balance)
   {
      if(flag==0)  {
      balance=balance+(0.002*deposit_balance+deposit_balance);//for 2nd case of deposit
     }
      else {
       balance=balance+(0.0025*deposit_balance+deposit_balance);//for 1st case of deposit
       
      }
      flag=1;
    
   }

 public void display(){
 System.out.println("Total balance"+balance);}
}




