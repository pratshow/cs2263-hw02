package edu.isu.cs.cs2263;

/**
 * Class to manage the classes that students take
 */
public class Course {
    private Integer number;
    private String subject;
    private String title;

    /**
     * @param number the course number
     * @param subject type or department of course
     * @param title name of the course
     */
    public Course(Integer number, String subject, String title) {
        this.number = number;
        this.subject = subject;
        this.title = title;
    }
    /**
     * @param num change the course number
     */
    public void setNumber(Integer num){ number = num; }
    /**
     * @param subj change the class subject/department name
     */
    public void setSubject(String subj){ subject = subj; }
    /**
     * @param title change the name of the course
     */
    public void setTitle(String title){ this.title = title; }
    /**
     * @return course number
     */
    public Integer getNumber(){ return number; }
    /**
     * @return subject/department name
     */
    public String getSubject(){ return subject; }
    /**
     * @return name of the course
     */
    public String getTitle(){ return title; }
}
