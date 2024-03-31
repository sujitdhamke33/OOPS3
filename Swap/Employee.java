package OOPS3.Swap;

public class Employee
{
    int Employee_Id;
    String Employee_Name;
    double Employee_Salary;

    public Employee(int employee_Id, String employee_Name, double employee_Salary) {
        super();
        Employee_Id = employee_Id;
        Employee_Name = employee_Name;
        Employee_Salary = employee_Salary;
    }

    public void display()
    {
        System.out.println("Employee Id is  : "+Employee_Id+" Employee Name is : "+Employee_Name+" Employee Salary is : "+Employee_Salary);
    }

    public void swap(Employee e1, Employee e2)
    {
        int id=e1.Employee_Id;
        String Name=e1.Employee_Name;
        double salary=Employee_Salary;

        e1.Employee_Id=e2.Employee_Id;
        e1.Employee_Name=e2.Employee_Name;
        e1.Employee_Salary=e2.Employee_Salary;

        e2.Employee_Id=id;
        e2.Employee_Name=Name;
        e2.Employee_Salary=salary;
    }


}