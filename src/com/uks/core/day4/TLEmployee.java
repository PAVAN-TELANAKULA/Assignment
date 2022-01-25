package com.uks.core.day4;

public class TLEmployee extends PLEmployee1 implements  IWork ,IReport
{
    public static void main(String[] args)
    {
        PLEmployee1 p = new PLEmployee1();
        p.doWork();
        p.reportToSenior();
    }
}
