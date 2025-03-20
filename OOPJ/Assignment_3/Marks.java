import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize an array to store marks of 20 students (each having 3 subjects)
        int[][] marks = new int[20][3];

        // Input: marks for each student in Physics, Chemistry, and Maths
        System.out.println("Enter the marks for 20 students in Physics, Chemistry, and Maths:");
        for (int i = 0; i < 20; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();
            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();
            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();
        }

        // Counters for students securing 75% and above, and 40% and below
        int above75Count = 0;
        int below40Count = 0;

        // Process each student's marks
        for (int i = 0; i < 20; i++) {
            // Calculate the aggregate marks and percentage
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            double percentage = (totalMarks / 300.0) * 100;

            // Check if the percentage is 75% and above
            if (percentage >= 75) {
                above75Count++;
            }

            // Check if the percentage is 40% and below
            if (percentage <= 40) {
                below40Count++;
            }
        }

        // Display the results
        System.out.println("Number of students securing 75% and above in aggregate: " + above75Count);
        System.out.println("Number of students securing 40% and below in aggregate: " + below40Count);
    }
}
