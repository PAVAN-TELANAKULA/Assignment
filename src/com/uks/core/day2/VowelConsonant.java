package com.uks.core.day2;
public class VowelConsonant {

    boolean  checkChar(String args[]) {
        char ch= args[0].charAt(0);

        switch (ch) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U': {

                System.out.println(ch + " is a vowel");
                break;
            }
            default:
                System.out.println(ch + " is a consonant");

        }
        return false;
    }
}