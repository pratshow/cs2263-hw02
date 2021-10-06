package edu.isu.cs.cs2263.adapter;

import java.util.List;
import edu.isu.cs.cs2263.*;

public class TokenizerAdapter implements PushbackTokenizer{
    List<Student> studentList;
    int cursor;

    /**
     * Constructor that needs a list of students and set's a cursor for current index
     * @param student a list of students
     */
    public TokenizerAdapter(List<Student> student){
        this.studentList = student;
        this.cursor = 0;
    }

    /**
     * updates current "index"
     * @param value value to change the index to
     */
    private void updateCursor(int value) {cursor = value;}

    /**
     * retruns the next name in the list of students and changes the cursor for next call
     * @return student's name
     */
    public String nextToken() {
        Student curStudent = studentList.get(cursor);
        updateCursor(cursor + 1);
        return curStudent.getName();
    }

    /**
     * checks if there are more names in the list by comparing the cursor to the size of the student list
     * @return true if there are more tokens, false if there are no more tokens
     */
    public boolean hasMoreToken() {
        return studentList.size() > cursor + 1;
    }

    /**
     * simply changes the cursor(index) back one to re-pop the token.
     */
    public void pushback() {
        updateCursor(cursor - 1);
    }

}
