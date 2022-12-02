package com.doc.beans;


public class Student implements Comparable<Student> {
    public int id;
    public String name;
    public int total_marks;

    public Student(int id, String name, int total_marks) {
        this.id = id;
        this.name = name;
        this.total_marks = total_marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal_marks() {
        return total_marks;
    }

    public void setTotal_marks(int total_marks) {
        this.total_marks = total_marks;
    }


    //here we are sorting 'this' object
    public int compareTo(Student st){
        if(st.total_marks<this.total_marks)
            return 1;
        else if(st.total_marks>this.total_marks)
            return -1;
        else{
            if(st.name.equals(this.name))
                return 0;
            else
                return this.name.charAt(0)-st.name.charAt(0);
        }

    }





    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", total_marks=" + total_marks +
                '}';
    }
}
