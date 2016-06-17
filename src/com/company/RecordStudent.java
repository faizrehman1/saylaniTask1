package com.company;

import java.util.Scanner;

public class RecordStudent {

    private String stdName,stdCours;
    private int stdAge;
    public Student[] students;
    private int count;


    public RecordStudent(){
        students=new Student[50];
    }


    Scanner input = new Scanner(System.in);



    public void insertStudent(){
        System.out.println("Enter Student Name");
        stdName = input.next();
        System.out.println("Enter Student Age");
        stdAge = input.nextInt();
        System.out.println("Enter Student Course Name");
        stdCours = input.next();



        students[count] = new Student(stdName,stdAge,stdCours);
        count++;
        System.out.println("Record Added..."+"\n");
    }

    public void displayStudent(){
        System.out.println("Name:"+"\t"+"Age:"+"\t"+"Course:"+"\t");
        for (Student s:students){
            if(s==null){
                break;
            }
            System.out.println(s.getsName()+"\t"+s.getAge()+"\t    "+s.getCourse()+"\n");
        }


    }

    public void searchStudent() {
        String studName;
        Student ss;
        System.out.println("Enter Student Name ");
        studName = input.next();
        for (Student s : students) {
            if (s==null){
                break;
            }
            else if (studName.equals(s.getsName())) {
                System.out.println(s.getsName() + "\t" + s.getAge() + "\t    " + s.getCourse());
            }
        }
    }

}
