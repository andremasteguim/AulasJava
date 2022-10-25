package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Set<Student> set = new HashSet<>(); 
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			int courseA = sc.nextInt();
			set.add(new Student(courseA));
		}
		
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			int courseB = sc.nextInt();
			set.add(new Student(courseB));
		}
		
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			int courseC = sc.nextInt();
			set.add(new Student(courseC));
		}
		
		System.out.println("Total students: " + set.size());
		
		sc.close();
	}

}
