/* interface Bank {
    int mainBalance=1000;
    void checkBalance();
}

class customer {
    int custID;
    String custName, accountType;

    void setCustomer(int id, String name, String type) {
        custID=id;
        custName=name;
        accountType=type;
    }

    void putCustomer() {
        System.out.println("Customer Id: " +custID);
        System.out.println("Customer Name: " +custName);
        System.out.println("Account type: " +accountType);
    }
}


class Transaction extends customer implements Bank 
{
    double bal;
    void setBalance(double b)
    {
        bal=b;
    }

public void checkBalance()
{
    System.out.println("Your account balance is: " +bal);
}

void deposit(double d)
{
    bal=bal+d;
}

double withdraw(double w)
{
    if(bal < mainBalance)
    {
        System.out.println("Not maintained balance");
        bal=bal-200;
    }
    else
    {
        bal=bal-w;
    }
    return bal;
}
}


public class pgmb3 {
    public static void main(String args[]) {
        Transaction t=new Transaction();
        t.setCustomer(101,"abc","SB");
        t.putCustomer();
        t.setBalance(4000);
        t.checkBalance();
        t.deposit(5000);

        double t1=t.withdraw(2000);
        System.out.println("Your current balance is: " +t1);
    }
    
}

























3. Create an interface Bank with a constant minBalance and an abstract method checkBalance(). Define a class Customer with data
 members for custld, custName, and account Type, along with methods to set and display customer details. Define another class 
 Transaction that extends Customer and implements Bank. It should have methods to: 

Set account balance

Deposit money

Withdraw money (if balance goes below the minimum balance print error message)

Implement checkBalance() method from Bank.

Write a java program to perform deposit and withdrawal operations, and display the accom balance after each transaction. */


interface bank {
    int mainBalance=5000;
    void checkBalance();  
}

class customer {
    int custID;
    String custName, accountType;

    void details(int id, String name, String type) {
    custID=id;
    custName=name;
    accountType=type;
    }



    void display() {
        System.out.println("Customer Id: " +custID);
        System.out.println("Customer Name: " +custName);
        System.out.println("Account Type: " +accountType);
    }
}


class Transaction extends customer implements bank {

    double balance;
    void setBalance(int bal) {
        balance=bal;
    }

    public void checkBalance() {
    System.out.println("Your account balance is: " +balance);
    }

    void deposit(int deposit) {
        balance=balance+deposit;
        System.out.println("Balance after deposit: " +balance);
    }

    void withdraw(int with) {

        if(balance < mainBalance) {
            System.out.println("No enough Balance");
        }
        else
        {
        balance=balance-with;
        System.out.println("Balance after withdrew:" +balance);
        }
    }



    public class pgmb3 {
        public static void main(String[] args) {
            Transaction t=new Transaction();
            t.details(12, "Nosled", "Childrens Acc");
            t.display();
            t.setBalance(5000);
            t.checkBalance();
            t.deposit(1000);
            t.withdraw(2000);
        }
    }
}
