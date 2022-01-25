package com.uks.core.day5;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DirectoryListing {
    public static void main(String[] args) throws InputMismatchException {
        Scanner sc = new Scanner(System.in);

        String path = "/home/brilworks-20";
        String fileExtension = sc.next() ;
        boolean recursive = sc.nextBoolean();

        File file = new File(path);

        String[] extensions = fileExtension.split(",");
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        if (file.isDirectory() && file.exists()) {
            for (File f : file.listFiles()) {
                if (f.isFile()) {
                    if (fileExtension.equals("*")) {
                        System.out.println(f.getName());
                    }
                    for (String extension : extensions) {
                        if (f.getName().contains(extension)) {
                            System.out.println(f.getName());
                        }
                    }
                } else if (file.isDirectory() && recursive) {
                    String[] conts = f.list();
                    for (String cont : conts) {
                        if (fileExtension.equals("*")) {
                            System.out.println(cont);
                        }
                        for (String ext : extensions) {
                            if (cont.contains(ext)) {
                                System.out.println(cont);
                            }
                        }
                    }
                }
            }
        } else {
            System.out.print("directory is not found");
        }
    }
}