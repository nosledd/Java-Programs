interface Bank {
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


public class pgmb1 {
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
