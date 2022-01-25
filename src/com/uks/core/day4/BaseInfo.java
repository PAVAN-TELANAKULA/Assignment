package com.uks.core.day4;
public class BaseInfo
{
    public static void main(String arg[])
    {
        BaseEmployee pe = new PLEmployee("Alex Richard");
        pe.doWork();
        pe.printData();
    }
}