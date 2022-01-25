package com.uks.core.day4;

public class PLEmployee1 implements IReport,IWork {
    public String Name = "Pavan";
    protected String LastName = "Telanakula";
    protected final String empType = "PL";
    protected double basicSalary = 25999;

    @Override
    public void reportToSenior()
    {
        System.out.println("Method reportToSenior");

    }

    @Override
    public void doWork()
    {
        System.out.println("Method doWork: ");
        System.out.println(Name);
        System.out.println(LastName);
        System.out.println(empType);
        System.out.println(basicSalary);
    }
}
