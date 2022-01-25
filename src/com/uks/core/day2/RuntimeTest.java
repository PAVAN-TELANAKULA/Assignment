package com.uks.core.day2;
import java.io.IOException;
import java.lang.ProcessBuilder;

public class RuntimeTest
{
    public static void main(String args[])throws IOException
    {
        ProcessBuilder bp=new ProcessBuilder();
        bp.command("Notepad.exe","c:\\file.txt");
        bp.start();
    }
}
