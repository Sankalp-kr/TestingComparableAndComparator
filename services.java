package com.doc.services;

import com.doc.beans.Student;
import com.doc.comparators.MyMarksComparator;
import com.doc.comparators.MyNameComparator;

import java.util.*;


public class services {

    public static List<Student> slist;

    static {
        slist = new ArrayList<>();

        slist.add(new Student(1, "Roushan", 95));
        slist.add(new Student(2, "Sankalp", 94));
        slist.add(new Student(3, "Shirish", 93));
        slist.add(new Student(4, "Anish", 93));
        slist.add(new Student(5, "Bobby", 93));
    }

    public List<Student> sortByMarks(){
        List<Student> sorted_slist= new ArrayList<>();
        //sorted_slist = (ArrayList)slist.clone();
        Iterator<Student> it = slist.iterator();
        while(it.hasNext()){
            sorted_slist.add(it.next());
        }
        //Collections.sort(sorted_slist);
        sorted_slist.sort(null);
        return sorted_slist;
    }

    public List<Student> compareByNameAllChar() {
        MyNameComparator mnc = new MyNameComparator();
        List<Student> sorted_slist = new ArrayList<>();
        Iterator<Student> it = slist.iterator();
        while (it.hasNext()) {
            sorted_slist.add(it.next());
        }
        sorted_slist.sort(mnc);

        return sorted_slist;
    }

        public List<Student> compareByMarks(){
            MyMarksComparator mnc2=new MyMarksComparator();
            List<Student> sorted_Marks=new ArrayList<>();
            Iterator<Student> it1=slist.iterator();
            while(it1.hasNext()){
                sorted_Marks.add(it1.next());
            }
            sorted_Marks.sort(mnc2);
            return sorted_Marks;
        }
    }




