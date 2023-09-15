package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee Employee = new Employee();
		
		System.out.print("Name: ");
		Employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		Employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");	
		Employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee:" + Employee);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		Employee.increaseSalary(percentage);
		System.out.println();
		System.out.println("Updated data: " + Employee);
		sc.close();
	}
	
}
