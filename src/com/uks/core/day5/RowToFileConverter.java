package com.uks.core.day5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class RowToFileConverter
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input Path : ");
        String inPath = sc.nextLine();

        System.out.println("Enter Destination Path : ");
        String outPath = sc.next();
        File inFile = new File(inPath);
        File outFile = new File(outPath);
        Path in = inFile.toPath();
        Path out = outFile.toPath();
        List<String> lines = Files.readAllLines(in);
        for(String line: lines){
            System.out.println(line);
            Files.write(out,lines);
        }
    }
}
