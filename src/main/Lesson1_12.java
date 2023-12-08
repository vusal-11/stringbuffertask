package main;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class Lesson1_12 {


    public static void main(String[] args) {

        System.out.println("Enter the word");
        StringBuilder stringBuffer = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        stringBuffer.append(str);

        boolean flag = true;
        while (flag) {
            System.out.println("Choose the options");
            System.out.println("1 - Append");
            System.out.println("2 - Reverse");
            System.out.println("3 - Delete");
            System.out.println("4 - Insert");
            System.out.println("5 - Deletecharat");
            System.out.println("6 - Replace");
            System.out.println("7 - Exit");
            String opt = scanner.next();
            scanner.nextLine();
            switch (opt) {

                case "1":
                    System.out.println("Enter the append word");
                    String s = scanner.next();
                    stringBuffer.append(s);
                    stringBuffer.toString();
                    System.out.println("Result is -> " + stringBuffer.toString());

                    break;
                case "2":
                    stringBuffer.reverse();
                    System.out.println("Result is -> " + stringBuffer.toString());
                    break;
                case "3":
                    System.out.println("Enter the start");
                    int start = scanner.nextInt();
                    System.out.println("Enter the end");
                    int end = scanner.nextInt();
                    stringBuffer.delete(start, end);
                    System.out.println("Result is -> " + stringBuffer.toString());

                    break;
                case "4":
                    System.out.println("Enter the offset");
                    int offset = scanner.nextInt();
                    System.out.println("Enter the insert word");
                    String insrworld = scanner.next();
                    stringBuffer.insert(offset, insrworld);
                    System.out.println("Result is -> " + stringBuffer.toString());

                case "5":
                    System.out.println("Enter the index to remove");
                    int index = scanner.nextInt();
                    stringBuffer.deleteCharAt(index);
                    System.out.println("Result is -> " + stringBuffer.toString());

                case "6":
                    System.out.println("Enter the start");
                    int star1 = scanner.nextInt();
                    System.out.println("Enter the end");
                    int end1 = scanner.nextInt();
                    System.out.println("Enter the replace word");
                    String replaceword = scanner.next();
                    stringBuffer.replace(star1, end1, replaceword);
                    System.out.println("Result is -> " + stringBuffer.toString());
                case "7":
                    System.out.println("Program is end");
                    flag = false;
                    break;
                default:
                    System.out.println("Unknown option");
                    break;

            }
        }


        scanner.close();


    }
}

