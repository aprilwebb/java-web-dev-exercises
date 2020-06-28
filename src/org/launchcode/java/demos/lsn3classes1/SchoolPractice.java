package org.launchcode.java.demos.lsn3classes1;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student student = new Student("April Webb", 1, 1, 4.0);
        System.out.println(student.getName());

        class Course{
            private Student students;
            private int grades;
            private String teacher;

            public Course(Student students, int grades, String teacher){
                this.students = students;
                this.grades = grades;
                this.teacher = teacher;
            }

            Course course = new Course (student, 92, "Jane Villanueva");


            class Teacher{
                private String firstName;
                private String lastName;
                private String subject;
                private int yearsTeaching;

                public Teacher(String firstName, String lastName, String subject, int yearsTeaching){
                    this.firstName = firstName;
                    this.lastName = lastName;
                    this.subject = subject;
                    this.yearsTeaching = yearsTeaching;
                }

                public String getFirstName(){
                    return firstName;
                }
                public void setFirstName(String aFirstName){
                    firstName = aFirstName;
                }

                public String getLastName(){
                    return lastName;
                }
                public void setLastName(String aLastName){
                    lastName = aLastName;
                }

                public String getSubject(){
                    return subject;
                }
                public void setSubject(String aSubject){
                    subject = aSubject;
                }

                public int getYearsTeaching(){
                    return yearsTeaching;
                }
                public void setYearsTeaching(int numYearsTeaching){
                    yearsTeaching = numYearsTeaching;
                }

            }
            Teacher profe = new Teacher("Jane", "Villanueva", "Spanish", 5);
        }
    }
}
