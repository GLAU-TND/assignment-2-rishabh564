package problem5.student;

import java.util.Scanner;

public class Student {
    private String name;
    private int rollno, backlog, apperingcount;
    private Scanner sc;


    public Student() {
        sc = new Scanner(System.in);
        System.out.print("Name :");
        this.name = sc.next();
        System.out.print("Roll.no : ");
        this.rollno = sc.nextInt();
        System.out.print("Backlog_count : ");
        this.backlog = sc.nextInt();
        System.out.print("appering_count");
        this.apperingcount = sc.nextInt();
    }





























