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
  
  public String setName(String newName){
    fullName = newName;
    return fullName;
  }
  public String setPasswd(String newPasswd){
    password = newPasswd;
    return password;
  }
  public short setPin(short newPin){
    //if not 4 digit, cannot be pin
    accountPin = newPin;
    return accountPin;
  }
  public int setAcctNum(int newAcctNum){
    //if not 9-digit, cannot be acct number
    accountNumber = newAcctNum;
    return accountNumber;
  }
  private double setBalance(double newBalance){
    balance = newBalance;
    return balance;
  }

  public void deposit(double depositAmount){
   double newBalance = balance + depositAmount;
   balance = newBalance;
  }
    
  public void withdraw(double withdrawAmount){
    double newBalance = balance - withdrawAmount;
    balance = newBalance;
  }
   
  public void toString(){
    System.out.println("Your full name is: " + fullName); //do we reference setFullName or just fullName?
   System.out.println("Your password is: " + password);
   System.out.println("Your account PIN is: " + accountPin);
   System.out.println("Your account number is: " + accountNumber);
   System.out.println("Your balance is: " + balance);
  }

  public static void main(String[] args){
    BankAccount account = new BankAccount();
    account.setName("Bob Smith");
    account.setPasswd("1234Unicorn");
    account.setPin(5678);
    account.setAcctNum(123456789);
    account.setBalance(100.51);
    account.toString();
  }
}
