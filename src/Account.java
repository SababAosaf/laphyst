/**
 * Created by Sabab Aosaf on 18-Sep-15.
 */
public class Account extends Customer{


    private Customer customer;
    private int accountNumber;
    private double balance;
    private String branch;


    public Account(){}
    public Account(Customer cust, int no, double b) {
        customer = cust;
        accountNumber = no;
        balance = b;
    }
    public Account(Customer cust, int no, String br) {
        customer = cust;
        accountNumber = no;
        branch = br;
    }
    public void setBalance(double b) {
        balance = b;
    }
    public void setBranch(String br) {
        branch  = br;
    }
    public int getAccountNumber()  {
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public Customer getCustomer()  {
        return customer;
    }
    public String getCustomerName() {
        return customer.getName();
    }
    public String getBranch(){
        return branch;
    }
    public void credit(double amount) {
        balance += amount;
    }
    public void debit(double amount){
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
    }
    public void print(){
        System.out.println( "Customer: " + getCustomerName() +" Branch: " + branch + " A/C no: " + accountNumber + " Balance: " + balance );
    }


}
