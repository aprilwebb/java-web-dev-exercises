package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
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

    }
