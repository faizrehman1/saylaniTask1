package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	// write your code here
    int add;
        char c;
        Scanner input  = new Scanner(System.in);
        RecordStudent record = new RecordStudent();
        RecordTeacher recordTeacher = new RecordTeacher();
        boolean faiz = true;




        do {

            System.out.println("Welcome To University Managment");
            System.out.println("+++++++++++++++++++++++++++++++");
            System.out.println("1.You Want to Add Teacher");
            System.out.println("2.You Want to Add Student");
            System.out.println("3.View Teacher");
            System.out.println("4.View Student");

            System.out.println("5.Search Student");
            System.out.println("6.Search Teacher");
            System.out.println("7.Exit");

            add = input.nextInt();

            System.out.println();
            switch (add) {
                case 1:
                    recordTeacher.insertTeacher();
                    break;
                case 2:
                    record.insertStudent();
                    break;
                case 3:
                    recordTeacher.displayTeacher();
                    break;
                case 4:
                    record.displayStudent();
                    break;
                case 5:
                    record.searchStudent();

                    break;
                case 6:
                    recordTeacher.searchTeacher();
                    break;
                default:
                    System.out.println("Something Went Wrong");
                    break;
            }

            if(add==7){
                faiz = false;
                break;
            }

        }while(faiz);
    }
}
