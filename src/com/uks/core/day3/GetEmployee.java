package com.uks.core.day3;
public class GetEmployee
{
    public static void main(String[] args)
    {
        try
        {
            int a = Integer.parseInt(args[0]);
            System.out.println("Invalid name");
        }
        catch(NumberFormatException e)
        {
            Employee employee = new Employee(args[0]);
            double salary = 0.0;
            if(args.length == 2)
            {
                salary = Double.parseDouble(args[1]);
                Employee.SalaryStructure eps = new Employee.SalaryStructure(salary);
                double total = salary * 12;
                eps.setHra(eps.getBasicSalary() * 0.125);
                System.out.println("Name : " + employee.getEmpName());
                System.out.println("Basic Salary : " + eps.getBasicSalary());
                System.out.println("HRA : " + eps.getHra());
                System.out.println("Total Salary : " + total);
            }
            else if(args.length == 1)
            {
                System.out.println("Name : " + employee.getEmpName());
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Pass 2 arguments only");
        }
    }
}