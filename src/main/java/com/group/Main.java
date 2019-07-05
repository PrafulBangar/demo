package com.group;
import java.util.Scanner;


public class Main {

    public static void main(String args[]) {
       int ch;
        Scanner sc =new Scanner(System.in);
do {
    System.out.println("enter your choice=");

    System.out.println("1)Insert Record=");
    System.out.println("2)Delete Record=");
    System.out.println("3)Update Record=");
    System.out.println("4)Read Information=");
    System.out.println("5)quite");


     ch = sc.nextInt();

    Insert obj1 = new Insert();
    Delete obj2 = new Delete();
    Update obj3 = new Update();
    Read obj4 = new Read();

    switch (ch) {
        case 1:
            //Insert obj1 =new Insert();
            obj1.insertRecord();
            break;
        case 2:
            obj2.deleteRecord();
            break;
        case 3:
            obj3.updateRecord();
            break;
        case 4:
            obj4.readRecords();
            break;

        //default:
          //  System.out.println("Invalid choice");
            //break;
    }
}while(ch!=5);


    }


}