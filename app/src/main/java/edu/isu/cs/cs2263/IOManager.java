package edu.isu.cs.cs2263;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Deals with saving and loading of Json objects from a file
 */
public class IOManager {
    Gson gson = new Gson();
    String json;
    IOManager(){}

    /**
     * reads the data from the specified file and creates the student objects in a list
     * @param file JSon file
     * @return a list of students
     * @throws IOException in case of read error
     */
    public List<Student> readData(String file) throws IOException{
        String jsonString = Files.readString(Path.of("./src/main/java/edu/isu/cs/cs2263/" + file));
        List<Student> stuList = gson.fromJson(jsonString, new TypeToken<List<Student>>() {}.getType());
        return stuList;
    }

    /**
     * Write data to a file for later retrieval. Saves a txt file in /src/main/java/edu/isu/cs/cs2263/jsonListOfStudents.txt
     * @param file file name for saving
     * @param data what data you would like to be saved (a list of students)
     */
    public void writeData(String file, List<Student> data){
        String json = gson.toJson(data);
        try{
            File newFile = new File("./src/main/java/edu/isu/cs/cs2263/" + file);
            FileWriter jsonFile = new FileWriter(newFile, false);
            jsonFile.write(json);
            jsonFile.close();
        }
        catch (IOException io){
            System.out.println("Couldn't create file");
        }
    }
}