import java.util.*;

class Student {
    String name;
    int rollnumber;
    double[] marks;

    public Student(String name, int rollnumber, double[] marks) {
        this.name = name;
        this.rollnumber = rollnumber;
        this.marks = marks;
    }

    public double calculateAvg() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }

    public char calculateGrade() {
        double avg = calculateAvg();
        if (avg >= 90) return 'A';
        if (avg >= 80) return 'B';
        if (avg >= 70) return 'C';
        if (avg >= 60) return 'D';
        return 'F';
    }

    public void displayDetails(){
        System.out.println("Name       :" + name);
        System.out.println("Rollnumber :" + rollnumber);
        System.out.println("Marks      :" + Arrays.toString(marks));
        System.out.println("Grade      :" + calculateGrade()); 
        System.out.println("Average    :" + calculateAvg()); 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int numOfStudents = input.nextInt();
        input.nextLine();

        Student[] students = new Student[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("\nEntering details for Student " + (i + 1) + ":");
            System.out.print("Enter the student name : ");
            String name = input.nextLine();

            System.out.print("Enter the student roll number:");
            int rollnumber = input.nextInt();

            double[] marks = new double[4];
            for (int j = 0; j < marks.length; j++) {
                char subject = (char) ('A' + j);
                System.out.print("Enter the marks for " + subject + ": ");
                marks[j] = input.nextDouble();
            }

            input.nextLine();
            students[i] = new Student(name, rollnumber, marks);
        }

        System.out.println("\n=== ALL STUDENT RECORDS ===");
        for (Student student : students) {
            student.displayDetails();
            System.out.println();
        }

        input.close();
    }
}


