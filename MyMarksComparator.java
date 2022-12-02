package com.doc.comparators;

import com.doc.beans.Student;

import java.util.Comparator;


public class MyMarksComparator implements Comparator<Student>{

    public int compare(Student st1,Student st2){
        if(st1.total_marks>st2.total_marks){
            return 1;
        }
        else if(st1.total_marks<st2.total_marks) {
            return -1;
        }
            else
                return 0;
        }
    }

