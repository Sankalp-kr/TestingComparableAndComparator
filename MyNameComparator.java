package com.doc.comparators;

import com.doc.beans.Student;

import java.util.Comparator;

public class MyNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student st1, Student st2){
        for(int i=0;i<st1.name.length()  && i<st2.name.length() ; i++){
            if(st1.name.charAt(i)==st2.name.charAt(i))
                continue;
            else
                //here we are sorting str1;
                // so the below code will give us desencing order
                //for ascending use st1-str2
                return st2.name.charAt(i)-st1.name.charAt(i);
        }
        return -1;

    }
}
