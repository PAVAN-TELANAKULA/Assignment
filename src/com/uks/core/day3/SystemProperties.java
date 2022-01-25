package com.uks.core.day3;
class SystemProperties
{
    public static void osName()
    {
        String osName=System.getProperty("os.name");
        System.out.println("Operating system:" +osName);
    }
    public static void UserDir()
    {
        String userDirectory = System.getProperty("user.dir");
        System.out.println("current user Directory:" +userDirectory);
    }
    public static void userName()
    {
        String userName = System.getProperty("user.name");
        System.out.println("User name : "+userName);
    }
}
