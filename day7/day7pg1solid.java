 
import java.io.FileWriter;
 
class BankAccount{
        String AccountNumber,AccountHolder;
        double balance;
 
    public BankAccount(String AccountNumber,String AccountHolder,double balance) {
        this.AccountNumber=AccountNumber;
        this.AccountHolder=AccountHolder;
        this.balance=balance;
    }
 
    public void deposit(double  amount){
        balance+=amount;
        System.out.println("Balance After deposit : "+balance);
     }
     
    public void withDraw(double amount) {
       if(balance>amount)
       {
        balance -= amount;
       }
       else{
        System.out.println("In sufficient Balance");
       }
    }
 
    public String getAccountNumber(){
       return AccountNumber;
    }
    public String getAccountHolder(){
        return AccountHolder;
    }
 
    public double getBalance(){
        return balance;
    }
 }
 class AccountPrinter
  {
    public void printAccountDetails(BankAccount account)
     {
        System.out.println(account.getAccountNumber());
        System.out.println(account.getAccountHolder());
        System.out.println(account.getBalance());
     }
  }
 
class AccountPersistence
   {
    public void savetoFile(BankAccount account)
    {
        String filename = "C:/Users/ashutosh.kumar/.vscode"
                  + account.getAccountNumber() + "account.txt";
 
        try{
                FileWriter writer = new FileWriter(filename);
                writer.write(account.getAccountNumber());
                writer.write(account.getAccountHolder());
                writer.write("Balance is" +account.getBalance());
                writer.close();
            }catch(Exception d){}
       
    }
   }
class day7pg1solid
  {
    public static void main(String asd[])
        {
           BankAccount obj= new BankAccount("4743","Ashutosh Kumar",20000);
           obj.deposit(10000);
           obj.withDraw(60000);
           
           AccountPrinter printer = new AccountPrinter();
            printer.printAccountDetails(obj);
              AccountPersistence sfile = new AccountPersistence();
              sfile.savetoFile(obj);
        }
  }
 
