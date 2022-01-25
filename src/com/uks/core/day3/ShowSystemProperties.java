package com.uks.core.day3;
public class ShowSystemProperties
{
    public static void main(String args[])
    {

        if(args[0].equals("osname"))
        {
            SystemProperties.osName();
        }
        else if(args[0].equals("udir"))
        {
            SystemProperties.UserDir();
        }
        else if(args[0].equals("uname"))
        {
            SystemProperties.userName();
        }
        else if(args[0].equals("all"))
        {
            SystemProperties.osName();
            SystemProperties.userName();
            SystemProperties.UserDir();
        }
    }
}
