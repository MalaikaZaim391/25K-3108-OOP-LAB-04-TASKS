package lab04tasks;

public class Employee {
    //test data members
    String employeeName;
    double employeeSalary;

    //original constructor, parameterized
    Employee(String name, double salary){
        this.employeeName = name;
        this.employeeSalary = salary;
    }

    Employee(Employee obj){
        this.employeeName = obj.employeeName;
        this.employeeSalary = obj.employeeSalary;
    }

    void display(){
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: $" + employeeSalary);
        System.out.println("-------------------\n");
    }

    public static void main(String[] args){
        Employee e1 = new Employee("Reyna Smith",456000.45);
        Employee e2 = new Employee(e1);

        System.out.println("copy created successfully...");
        System.out.println("****BEFORE EDITING THE COPY E2*****\n");

        //printing both e1 and e2 to confirm data is same
        System.out.println("e1 (original):\n");
        e1.display();
        System.out.println("e2 (copy):\n");
        e2.display();

        //making changes to e2 to check if original changes:
        e2.employeeName = "Jace Young";
        e2.employeeSalary = 65000.98;

        System.out.println("edited the copy e2 successfully...");

        //printing both e1 and e2 to confirm original data is same and copy is edited
        System.out.println("****AFTER EDITING THE COPY E2*****\n");
        System.out.println("e2 (copy - CHANGED, DIFFERENT THAN ORIGINAL):\n");
        e2.display();
        System.out.println("e1 (original - REMAINED THE SAME):\n");
        e1.display();


    }


}
