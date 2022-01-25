package com.uks.core.day4;
abstract class BaseEmployee
{

    abstract void doWork();
    abstract void printData();
}

class PLEmployee extends BaseEmployee
{
    public String name;
    protected String lastName="Pavan";
    protected final String empType="PI";
    protected double basicSalary=22840;


    public PLEmployee(String n)
    {
        name = n;
    }


    void doWork()
    {
        System.out.println(name); ;
        System.out.println(lastName);
        System.out.println(empType);
        System.out.println(basicSalary);

    }
    void assignTaskToJunior()
    {
        System.out.println("assignTasttojunior");
    }
    void collectReportFromJunior() {
        System.out.println("collectReportFromJunior");
    }
    void reportToSenior()
    {
        System.out.println("report to senior");
    }
    void printData()
    {
        assignTaskToJunior();
        collectReportFromJunior();
        reportToSenior();

    }
}
