package com.careerit.lcj.day10;

import lombok.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class Student{
    private int rollno;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollno == student.rollno && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollno, name);
    }
}
public class SetExample4 {

    public static void main(String[] args) {

            Student student1 = new Student(1001,"Krish");
            Student student2 = new Student(1001,"Krish");
            Student student3 = new Student(1002,"Manoj");
            Student student4 = new Student(1003,"Charan");
            Student student5 = new Student(1002,"Manoj");

            Set<Student> students = new HashSet<>();
            students.add(student1);
            students.add(student2);
            students.add(student3);
            students.add(student4);
            students.add(student5);

            System.out.println(students.size());
    }

}
