import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Student[] students = new Student[n];

        // Input student data
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (i + 1));
            Student s = new Student();

            System.out.print("Roll Number: ");
            s.setRollNumber(sc.nextInt());
            sc.nextLine();

            System.out.print("Name: ");
            s.setName(sc.nextLine());

            System.out.print("Course: ");
            s.setCourse(sc.nextLine());

            System.out.print("Marks: ");
            s.setMarks(sc.nextDouble());
            sc.nextLine();

            students[i] = s;
        }

        // Display all student records
        System.out.println("\n--- Student Records ---");
        for (int i = 0; i < n; i++) {
            students[i].displayStudent();
        }

        sc.close();
    }
}