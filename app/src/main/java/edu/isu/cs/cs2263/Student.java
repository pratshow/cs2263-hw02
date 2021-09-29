package edu.isu.cs.cs2263;

public class Student {
    String firstName;
    String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private void setFirstName(String name){
        firstName = name;
    }

    private void setLastName(String name){
        lastName = name;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String toString(){
        String fullName = (firstName + " " + lastName);
        return fullName;
    }
}
