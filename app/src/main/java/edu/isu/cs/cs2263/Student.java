package edu.isu.cs.cs2263;

import java.util.*;

/**
 * Class to manage all the students and what classes they are taking.
 */
public class Student {
    private String firstName;
    private String lastName;
    List<Course> courseList;

    /**
     * Makes a Student object with a full name and an empty class list.
     * @param firstName the student's first name
     * @param lastName the student's last name
     */
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseList = new ArrayList<>();
    }

    /**
     * @param name students first name
     */
    public void setFirstName(String name){ firstName = name; }

    /**
     * @param name students last name
     */
    public void setLastName(String name){ lastName = name; }

    /**
     * @return the student's first name
     */
    public String getFirstName(){ return firstName; }

    /**
     * @return student's last name
     */
    public String getLastName(){ return lastName; }

    /**
     * @return the list of courses that the student is enrolled in.
     */
    public List<Course> getCourseList(){ return courseList; }

    /**
     * Creates a string for the first and last name of the student and all of the classes they are enrolled in.
     * @return a string with the students name and list of classes
     */
    public String getName(){
        return (firstName + " " + lastName);
    }

    /**
     * Adds a course to a students course list.
     * @param course Course the student would like to enroll in.
     */
    public void addCourse(Course course){ courseList.add(course); }

}
