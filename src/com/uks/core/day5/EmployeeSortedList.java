package com.uks.core.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class EmployeeSortedList{
    public static void SortedList() throws IOException {
        RowPrinter.tableFormat();

        System.out.println("enter Column name for sorting :");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println("after sorting : \n");

        String row = "", splitby = ",", filePath = "/home/brilworks-20/my1.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        class BaseEmployee {
            public String empCode;
            public String fname;
            public String lname;
            public String emptype;
            public Double basicsal;
        }

        class GeneralEmployee extends BaseEmployee {
            public GeneralEmployee(String eCode, String fnm, String lnm, String eType, String empsal) {
                empCode = eCode;
                fname = fnm;
                lname = lnm;
                emptype = eType;
                basicsal = Double.parseDouble(empsal);
            }
        }

        List<BaseEmployee> list = new ArrayList<>();
        while ((row = br.readLine()) != null) {
            String[] employee = row.split(splitby);
            GeneralEmployee baseEmployee1 = new GeneralEmployee(employee[0], employee[1],
                    employee[2], employee[3], employee[4]);

            list.add(baseEmployee1);

        }

        Comparator<BaseEmployee> com = null;
        if ( input.equals("fname") ) {
            class compareFirstName implements Comparator<BaseEmployee> {
                @Override
                public int compare(BaseEmployee o1, BaseEmployee o2) {
                    return o1.fname.compareTo(o2.fname);
                }
            }
            com = new compareFirstName();
        }

       if ( input.equals("lname") ) {
            class compareLastName implements Comparator<BaseEmployee> {
                @Override
                public int compare(BaseEmployee o1, BaseEmployee o2) {
                    return o1.lname.compareTo(o2.lname);
                }
            }
            com = new compareLastName();
        }

        if ( input.equals("emptype") ) {
            class compareEmpType implements Comparator<BaseEmployee> {
                @Override
                public int compare(BaseEmployee o1, BaseEmployee o2) {
                    return o1.emptype.compareTo(o2.emptype);
                }
            }
            com = new compareEmpType();
        }

        if ( input.equals("basicsal") ) {
            class compareEmpSalary implements Comparator<BaseEmployee> {
                @Override
                public int compare(BaseEmployee o1, BaseEmployee o2) {
                    return o1.basicsal.compareTo(o2.basicsal);
                }
            }
            com = new compareEmpSalary();
        }


        Formatter fmt = new Formatter();
        fmt.format("%1s %14s %15s %15s %15s\n", "empcode", "fname", "lname", "emptype", "basicsal");

        if(input.equals("empcode")) {
            class compareEmpCode implements Comparator<BaseEmployee> {
                @Override
                public int compare(BaseEmployee o1, BaseEmployee o2) {
                    return o1.empCode.compareTo(o2.empCode);
                }
            }
            com = new compareEmpCode();
        }

        Collections.sort(list, com);

        for (BaseEmployee e : list)
            fmt.format("%-15s %-15s %-15s %-15s %-15s\n", e.empCode,
                    e.fname, e.lname, e.emptype, e.basicsal);
        System.out.println(fmt);

    }
}
