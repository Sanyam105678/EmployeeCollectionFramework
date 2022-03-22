package com.company;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {



    public static void main(String[] args) {
	// write your code here
        TreeSet<Employee> ts = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        int count=1;
        while(true){
            System.out.println("Enter Details of Employee"+count);
            System.out.println("Enter Employee Id:");
            int emp = sc.nextInt();
            System.out.println("Enter Employee Name:");
            String name = sc.next();
            System.out.println("Enter Employee Address:");
            String add = sc.next();
            System.out.println("Enter Employee Salary:");
            double sal = sc.nextDouble();
            count++;
            Employee obj = new Employee(emp,name,add,sal);
            ts.add(obj);
            System.out.println("Want to enter more? (Y/N)");
            String ans = sc.next();
            System.out.println("-----------------------------------");
            if(ans.equalsIgnoreCase("N"))
                break;
        }
        System.out.println("Employee Details");
        System.out.println("=====================================");
        System.out.println(ts);

    }
}
