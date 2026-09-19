
import java.util.*;
public class employeedetails {
    String name;
    int id;
    String dept;

    public employeedetails(String name, int id ,String dept){
        this.name = name;
        this.id = id;
        this.dept = dept;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int count = input.nextInt();
        input.nextLine();

        employeedetails[] emps = new employeedetails[count];

        for (int i = 0; i < emps.length; i++) {
            System.out.print("Enter employee name: ");
            String name = input.nextLine();

            System.out.print("Enter employee id: ");
            int id = input.nextInt();
            input.nextLine();

            System.out.print("Enter employee dept: ");
            String dept = input.nextLine();

            emps[i] = new employeedetails(name, id, dept);
            System.out.println();
        }

        System.out.print("Enter the first employee name to check: ");
        String searchName1 = input.nextLine();
        employeedetails emp1 = null;

        System.out.print("Enter the second employee name to check: ");
        String searchName2 = input.nextLine();
        employeedetails emp2 = null;

        for (int i = 0; i < emps.length; i++) {
            if (emps[i].name.trim().equalsIgnoreCase(searchName1.trim())) {
                emp1 = emps[i];
            }
            if (emps[i].name.trim().equalsIgnoreCase(searchName2.trim())) {
                emp2 = emps[i];
            }
        }

        System.out.print("   Result   ");
        if (emp1 == null || emp2 == null) {
            System.out.println("one or both the employees names not found");
        } else if (emp1.dept.trim().equalsIgnoreCase(emp2.dept.trim())) {
            System.out.println(emp1.name + " and " + emp2.name + " work in the same dept");
        } else {
            System.out.println("both dont work in same dept");
        }
        input.close();
    }
    
}
