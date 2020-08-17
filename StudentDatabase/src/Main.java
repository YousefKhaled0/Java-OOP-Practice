import java.util.Scanner;

import student.Course;
import student.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number of students to enroll ");
		int number = new Scanner(System.in).nextInt();
		Student[] students = new Student[number];
		for (int i = 0 ; i < number ; i++) {
			System.out.println("***************************************************");
			students[i] = new Student();
			students[i].payTuition();
			System.out.println(students[i]);
			System.out.println("***************************************************");
		}
	}

}
