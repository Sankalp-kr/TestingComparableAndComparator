package com.doc.TestStudent;
import com.doc.services.services;
import com.doc.beans.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sort by marks");
        services sc = new services();
        List<Student> print_This = new ArrayList<>();
        print_This = sc.compareByMarks();

        System.out.println("This is the original list");
        for(Student test: services.slist){
            System.out.println(test);
        }

        System.out.println();
        System.out.println("This will return sorted list by marks");
        for(Student test: print_This){
            System.out.println(test);
        }


        System.out.println();
        System.out.println("This will return the list with name sorted to all characters");
        print_This = sc.compareByNameAllChar();
        for(Student test: print_This){
            System.out.println(test);
        }



    }
}