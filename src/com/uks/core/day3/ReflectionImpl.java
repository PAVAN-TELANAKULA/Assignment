package com.uks.core.day3;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;


public class ReflectionImpl {
    public static void getAll() throws NoSuchMethodException {
        Details cd = new Details();
        Class cls = cd.getClass();
        System.out.println(cls.getName());
        System.out.println("1. Methods");
        System.out.println("2. Fields");
        System.out.println("3. All");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice){
            case 1:{
                Method[] methods = cls.getMethods();
                System.out.println("Methods:");
                for(Method meth: methods){
                    System.out.println(meth.getName());
                }
                break;
            }
            case 2:{
                Field[] fds = cls.getFields();
                for(Field fd: fds){
                    System.out.println(fd.getName());
                }
                break;
            }
            default:{
                Constructor constructor = cls.getConstructor();
                System.out.println("Name : "+constructor.getName());

                Method[] methods = cls.getMethods();
                System.out.println("Methods:");
                for(Method meth: methods){
                    System.out.println(meth.getName());
                }
                System.out.println("Fields :");
                Field[] fds = cls.getFields();
                for(Field fd: fds){
                    System.out.println(fd.getName());
                }
                break;
            }
        }
    }
}
