/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package edu.isu.cs.cs2263;

import edu.isu.cs.cs2263.adapter.TokenizerAdapter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Simple class to test the adapter
 */
class AppTest {
    TokenizerAdapter adapter;

    /**
     * Set's up objects and gets the list of students from memory
     * @throws IOException
     */
    @BeforeEach
    void setUp() throws IOException {
        App app  = new App();
        app.init();
        List<Student> stuList = app.loadData("jsonListOfStudents.txt");
        adapter = new TokenizerAdapter(stuList);
    }

    /**
     * Test all the functions in TokenizerAdapter assuming it uses the student list in memory
     */
    @Test
    @DisplayName("Next token should return student's name")
    void testStudentName(){
        assertTrue(adapter.hasMoreToken(), "hasMoreTokens should be true");
        assertEquals("Show Pratoomratana", adapter.nextToken(), "Stu1 failed");
        assertEquals("John Jonny", adapter.nextToken(), "Stu2 failed");
        adapter.pushback();
        assertEquals("John Jonny", adapter.nextToken(), "Pushback failed");
        assertEquals("Sarah Sarith", adapter.nextToken(), "Stu3 failed");
        assertFalse(adapter.hasMoreToken(), "hasMoreTokens should be false");
    }
}
