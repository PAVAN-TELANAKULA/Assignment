package com.uks.core.day3;
class Employee {
    private String empName;
    public Employee(String name){
        empName = name;
    }
    public String getEmpName() {
        return empName;
    }
    static class SalaryStructure{
        private double basicSalary;
        public SalaryStructure(double bs){
            basicSalary = bs;
        }
        private double hra;
        public double getBasicSalary() {
            return basicSalary;
        }
        public void setHra(double h){
            hra= h;
        }
        public double getHra() {
            return hra;
        }
    }
}