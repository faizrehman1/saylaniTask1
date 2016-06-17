package com.company;

import java.util.Scanner;

public class RecordTeacher {

  private  String teachName;
  private   String teachCourse;
    private int teachAge;
    private int count;

    private Teacher[] teachers;


    Scanner input = new Scanner(System.in);

    public RecordTeacher() {
        teachers = new Teacher[20];
    }

    public void insertTeacher(){
        System.out.println("Enter Teacher Name");
        teachName = input.next();
        System.out.println("Enter Teacher Age");
        teachAge = input.nextInt();
        System.out.println("Enter Teaching Course Name ");
        teachCourse = input.next();



        teachers[count] = new Teacher(teachName,teachCourse,teachAge);
        count++;
        System.out.println("Record Added..."+"\n");
    }

    public void displayTeacher(){
        System.out.println("Name:"+"\t"+"Age:"+"\t"+"Course:"+"\t");
        for (Teacher t:teachers){
            if(t==null){
                break;
            }
            System.out.println(t.getTeachName()+"\t"+t.getTeachAge()+"\t    "+t.getTeachCourse()+"\n");
        }


    }

    public void searchTeacher() {
        String studName;
        Student ss;
        System.out.println("Enter Student Name ");
        studName = input.next();
        for (Teacher t : teachers) {
            if (t==null){
                break;
            }
            else if (studName.equals(t.getTeachName())) {
                System.out.println(t.getTeachName() + "\t" + t.getTeachAge() + "\t    " + t.getTeachCourse());
            }
        }
    }
}
