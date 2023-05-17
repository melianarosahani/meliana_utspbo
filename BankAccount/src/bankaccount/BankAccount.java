/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankaccount;

/**
 *
 * @author ASUS
 */
public class BankAccount {
  String accountNumber;
   double balance;

  public BankAccount(String accountNumber, double balance) {
      this.accountNumber = accountNumber;
      this.balance = balance;
  }

  public void deposit(double amount) {
     System.out.println(balance += amount);
  }

  public void withdraw(double amount) {
      if (balance >= amount) {
         System.out.println( balance -= amount);
      } else {
          System.out.println("Insufficient balance");
      }
  }

  public double getBalance() {
      return balance;
  }
  
    public static void main(String[] args) {
     BankAccount bank1 = new BankAccount("11223344", 0);
    System.out.println("Saldo: " + bank1.getBalance()); 
    System.out.print("Deposit: ");
   bank1.deposit(200000);
    System.out.print("Withdraw: ");
    bank1.withdraw(80000);

    bank1.getBalance();
    System.out.println("Saldo Sisa: "+ bank1.getBalance());
  }
}