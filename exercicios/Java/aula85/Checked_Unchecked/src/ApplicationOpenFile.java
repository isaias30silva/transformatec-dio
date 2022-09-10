import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.annotation.processing.FilerException;

public class ApplicationOpenFile{

    static void readFile (String filePath) throws FileNotFoundException, IOException {
        try {
            FileReader file = new FileReader(filePath);
            readingFile(file);
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please, try again later.");
            throw new FileNotFoundException();
        } finally {
            System.out.println("Ending the program");
        }
    }

    static void readingFile (FileReader file) throws IOException {
        BufferedReader bReaderFile = new BufferedReader(file);
        String fileLine;

        while((fileLine = bReaderFile.readLine()) != null) {
            System.out.println(fileLine);
        }
        bReaderFile.close();

    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        System.out.println("Hello World!");
        readFile(filePath:"/");
    }
}