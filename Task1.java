package codeApha.com;
import java.util.Scanner;
public class Task1 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of students: ");

	        int students_Count = sc.nextInt();
	        double[] student_Grades = new double[students_Count];

	        for (int i = 0; i < students_Count; i++) {
	            System.out.print("Enter grade for student " + (i + 1) + " between 0 and 100 : ");
	            double grade = sc.nextDouble();
	            if(grade>=0 && grade<=100) {
	                student_Grades[i] = grade;
	            }else{
	                System.out.println("Invalid Input.");
	                i--;
	            }
	        }

	        studentResults(student_Grades);

	        sc.close();
	    }
	    private static void studentResults(double[] grades_Array) {
	        double total_score = 0;
	        double max_score = -1;
	        double min_score = 101;

	        for (double studentScore : grades_Array) {
	            total_score += studentScore;

	            if (studentScore > max_score) {
	                max_score = studentScore;
	            }

	            if (studentScore < min_score) {
	                min_score = studentScore;
	            }
	        }

	        double average =  total_score / grades_Array.length;

	        System.out.println("Highest Score of Students is : " + (int)max_score);
	        System.out.println("Lowest Score of Students is: " + (int)min_score);
	        System.out.println("Average Student Score is: " + average);
	    }
	}


