// UnicornHead:: Melody Lew, Ariella Katz, Lior
// APCS
// HW18 -- CPA-One
// 2021-10-14

/* 
DISCO
 
QCC

Team UnicornHead’s Latest and Greatest Q2 Response:
Team UnicornHead’s Latest and Greatest Q3 Response:
 */

public class BankAccount{
  private String fullName;
  private String password;
  private int accountPin;
  private int accountNumber;
  private double balance;
  
  private String setFullName(String full){
    fullName = full;
    return fullName;
  }
  private String setPassword(String pass){
    password = pass;
    return password;
  }
  private int setAccountPin(int pin){
    //if not 4 digit, cannot be pin
    accountPin = pin;
    return accountPin;
  }
  private int setAccountNumber(int num){
    //if not 9-digit, cannot be acct number
    accountNumber = num;
    return accountNumber;
  }
  private double setBalance(double money){
    balance = money;
    return balance;
  }
  private void printAccountInfo(){
    System.out.println(fullName); //do we reference setFullName or just fullName?
  }
  //private double deposit(double){
    
//  private double withdraw(double){


  public static void main(String[] args){
    BankAccount account = new BankAccount();
    account.setFullName("Bob Smith");
    account.setPassword("1234Unicorn");
    account.setAccountPin(1234);
    account.setAccountNumber(123456789);
    account.setBalance(100.50);
    account.printAccountInfo();
  }
}
