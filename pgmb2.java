/* 2. Program to implement the following class hierarchy: Student: id, name StudentExam derived from Student): 
Marks of 3subjects, total marks StudentResult (derived from StudentExam): percentage, grade.
Define appropriate methods to accept and calculate based on existing criteria and display details of N students. */

import java.util.Scanner;

class student {
    String name;
    int id;
}

class studentExam extends student {
    int marks1, marks2, marks3, total;
}

class studentResult extends studentExam {
    double percentage;
    String grade;

    void input() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the ID: ");
        id=sc.nextInt();
        System.out.println("Enter the Name: ");
        name=sc.next();
        System.out.println("Enter the 3 subject marks");
        marks1=sc.nextInt();
        marks2=sc.nextInt();
        marks3=sc.nextInt();
     
    }

    void cal() {
        total=marks1+marks2+marks3;
        percentage=total/3;

        if(percentage>=85) {
            grade="Distinction";
        }
        else if(percentage>=60) {
            grade="First Class";
        }
        else if(percentage>=45) {
            grade="Second Class";
        }
        else if(percentage>=30) {
            grade="First Class";
        }
        else {
            grade="Fail";
        }
    }


    void display() {
        System.out.println("\n---Student Info---");
        System.out.println("Student ID: " +id);
        System.out.println("Student Name: " +name);
        System.out.println("\n---Academic Result---");
        System.out.println("Sub1: " +marks1);
        System.out.println("Sub2: " +marks2);
        System.out.println("Sub3: " +marks3);
        System.out.println("Total: " +total);
        System.out.println("Percentage: " +percentage);
        System.out.println("Grade: " +grade);
    }
}

public class pgmb2 {
    public static void main(String args[]) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
        studentResult result=new studentResult();
        result.input();
        result.cal();
        result.display();
        }
    }
}