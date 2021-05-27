package learn.oop.inheritance;

public class BankAccount {
    private String accountNumber;
    private String phone;
    private  double balance;
    private String custumerName;
    private String email;


    public BankAccount(String custumerName, String email,String phone) {
        this("99999","100.55",12,email,phone);

    }

    public BankAccount() {
        this("5678","123456789",22.5,"Default name","Default email");
        System.out.println("Empty constructor");
    }

    public BankAccount(String accountNumber, String phone, double balance, String custumerName, String email) {
        System.out.println("account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.phone = phone;
        this.balance = balance;
        this.custumerName = custumerName;
        this.email = email;
    }


    public void deposit(double money){

        this.balance += money;
        System.out.println("deposite successful you have: "+getBalance() +" in your account" );

    }
    public void withdraw(double money){
        if(this.balance - money < 0){
            System.out.println("only " + getBalance() +" is available , you dont have enought money");
        }else{
            double fund =  getBalance() - money;
            setBalance(fund);
            System.out.println("withdrawal successful you new balance is: " + getBalance());
        }

    }



    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustumerName() {
        return custumerName;
    }

    public void setCustumerName(String custumerName) {
        this.custumerName = custumerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
