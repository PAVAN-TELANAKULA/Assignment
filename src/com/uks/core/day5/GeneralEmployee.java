package com.uks.core.day5;

public class GeneralEmployee extends BaseEmployee1 implements Comparable<GeneralEmployee> {

    int empCode;

    public GeneralEmployee(String empcode, String fname, String lname, String emptype, String basicsal) {
        super(fname, lname, emptype, basicsal);
        this.empCode = Integer.parseInt(empcode);
    }


    @Override
    public int compareTo(GeneralEmployee o) {
        if((this.empCode)>(o.empCode))
            return 1;
        else
            return -1;
    }
}
