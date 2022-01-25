package com.uks.core.day5;

public  class BaseEmployee1
{

    String fName,lName,empType;
    int basicSal;

    BaseEmployee1(String fname, String lname, String emptype, String basicsal){
        this.fName=fname;
        this.lName=lname;
        this.empType=emptype;
        this.basicSal= Integer.parseInt(basicsal);
    }

}