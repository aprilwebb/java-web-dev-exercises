package org.launchcode.java.demos.lsn3classes1;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student student = new Student("April Webb", 1, 1, 4.0);
        student.addGrade(15, 3.5);
        student.addGrade(18, 4.0);
        System.out.println(student);
        System.out.println(student.getGradeLevel());


        class Teacher {
            private String firstName;
            private String lastName;
            private String subject;
            private int yearsTeaching;

            public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.subject = subject;
                this.yearsTeaching = yearsTeaching;
            }

            public String getFirstName() {
                return firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public String getLastName() {
                return lastName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }

            public String getSubject() {
                return subject;
            }

            public void setSubject(String subject) {
                this.subject = subject;
            }

            public int getYearsTeaching() {
                return yearsTeaching;
            }

            public void setYearsTeaching(int yearsTeaching) {
                this.yearsTeaching = yearsTeaching;
            }
        }

        class Course {
            private String subject;
            private Teacher instructor;
            private ArrayList<Student> enrolledStudents;

            public Course(String subject, Teacher instructor, ArrayList<Student> enrolledStudents) {
                this.subject = subject;
                this.instructor = instructor;
                this.enrolledStudents = enrolledStudents;
            }

            public String getSubject() {
                return subject;
            }

            public void setSubject(String subject) {
                this.subject = subject;
            }

            public Teacher getInstructor() {
                return instructor;
            }

            public void setInstructor(Teacher instructor) {
                this.instructor = instructor;
            }

            public ArrayList<Student> getEnrolledStudents() {
                return enrolledStudents;
            }

            public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
                this.enrolledStudents = enrolledStudents;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof Course)) return false;
                Course course = (Course) o;
                return getSubject().equals(course.getSubject()) &&
                        getInstructor().equals(course.getInstructor()) &&
                        getEnrolledStudents().equals(course.getEnrolledStudents());
            }

            @Override
            public String toString() {
                return "Course{" +
                        "subject='" + subject + '\'' +
                        ", instructor=" + instructor +
                        ", enrolledStudents=" + enrolledStudents +
                        '}';
            }
        }
    }
}



