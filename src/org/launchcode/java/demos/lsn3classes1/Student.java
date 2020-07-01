package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        double currentTotalQualityScore = gpa * numberOfCredits;
        double newTotalQualityScore = currentTotalQualityScore + grade * courseCredits;
        numberOfCredits += courseCredits;
        gpa = newTotalQualityScore / numberOfCredits;
    }

    public String getGradeLevel() {
        if (numberOfCredits > 0 && numberOfCredits <= 29){
            return "Freshman";
        } else if (numberOfCredits >=30 && numberOfCredits <=59){
            return "Sophomore";
        } else if (numberOfCredits >=60 && numberOfCredits <= 89){
            return "Junior";
        } else {
            return "Senior";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getStudentId() == student.getStudentId() &&
                getNumberOfCredits() == student.getNumberOfCredits() &&
                Double.compare(student.getGpa(), getGpa()) == 0 &&
                getName().equals(student.getName());
    }

    @Override
    public String toString() {
        return "Student:" +
                "\nName: '" + name + '\'' +
                "\nStudent Id: " + studentId +
                "\nNumber Of Credits: " + numberOfCredits +
                "\nGPA: " + gpa;
    }
}
