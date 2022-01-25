package com.uks.core.day5;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RowReader{

    public static void main(String args[]) throws IOException {

        RowPrinter.readFile("/home/brilworks-20/my1.csv");
    }

    public static void printRecord() throws IOException {
        String row = "";
        String splitBy = ",";

        BufferedReader br = new BufferedReader(new FileReader("/home/brilworks-20/my1.csv"));

        List<GeneralEmployee> list = new ArrayList<>();

        while ((row = br.readLine()) != null) {
            String[] employee = row.split(splitBy);

            BaseEmployee1 baseEmployee1 = new GeneralEmployee(employee[0],
                    employee[1], employee[2], employee[3], employee[4]);
            list.add((GeneralEmployee) baseEmployee1);


        }

        Map<Integer, String> map = new HashMap<>();
        for(GeneralEmployee e:list){

            map.put(Integer.valueOf(e.empCode)," "+e.fName+" "+e.lName+
                    " "+e.empType+" "+e.basicSal);

        }
        System.out.println(map);

    }
}