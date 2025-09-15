/* 1. Create a class named 'Member' having data members: Name, Age, Phone Number, Place and Salary. It also has a method named 'printSalary' 
 which prints the salary of the members. Two classes Employee' and 'Manager' inherit the 'Member' class. The Employee' and Manager' classes
 have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an employee 
 and a manager by making an object of both of these classes and print the same. */



class member {
    String name, phoneNo, place;
    int age;
    double salary;
    
      void printSalary() {
            System.out.println("Salary: " +salary);
    }

    
}

class employee extends member {
    String specialization;

    void  display() {
        System.out.println("\n---Employee Details---");
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("PhoneNo: " +phoneNo);
        System.out.println("Address: " +place);
        printSalary();
        System.out.println("Specialization: " +specialization);
    }

}

class manager extends member {
    String department;

       void  display() {
        System.out.println("\n---Manager Details---");
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("PhoneNo: " +phoneNo);
        System.out.println("Address: " +place);
        printSalary();
        System.out.println("Department: " +department);
    }

}

public class pgmb1 {
    public static void main(String[] args) {
        employee emp=new employee();
        emp.name="Nosled";
        emp.age=19;
        emp.phoneNo="010010101";
        emp.place="Unknown";
        emp.salary=200000;
        emp.specialization="Talking";

        emp.display();

        manager mg=new manager();
        mg.name="Elon Musk";
        mg.age=120;
        mg.phoneNo="1010100101";
        mg.place="Unknown";
        mg.salary=10;
        mg.department="Mars";

        mg.display();

       
        
    }
}












