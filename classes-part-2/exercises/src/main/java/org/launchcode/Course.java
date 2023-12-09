package org.launchcode;

import java.util.ArrayList;
import java.util.Objects;
import java.util.List;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public Course(String topic, Teacher instructor, ArrayList<Student> enrolledStudents) {
        this.topic = topic;
        this.instructor = instructor;
        this.enrolledStudents = enrolledStudents;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.


    @Override
    public String toString() {
        return "Course{" +
                "topic='" + topic + '\'' +
                ", instructor=" + instructor +
                ", enrolledStudents=" + enrolledStudents +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if(getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(topic, course.topic) && Objects.equals(instructor, course.instructor) && Objects.equals(enrolledStudents, course.enrolledStudents);
    }
    @Override
    public int hashCode() {
        return Objects.hash(topic, instructor, enrolledStudents);
    }
    public static void main(String ar[]){
        Teacher t1 = new Teacher("John","Smith","Math",10);
        Teacher t2 = new Teacher("John","Smith","Math",10);

        Student s1 = new Student("Stu",123,20,4.0);
        Student s2 = new Student("Stu",123,20,4.0);
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);

        Course c1 = new Course("Math",t1,students);
        Course c2 = new Course("Math",t2,students);


        System.out.println(t1.equals(t2));
        System.out.println(s1.equals(s2));
        System.out.println(c1.equals(c2));


    }




}
