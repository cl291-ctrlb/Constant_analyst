// ✅ Java Input/Output (I/O) – Simple Explanation
// The Java I/O Framework allows your program to read data (input) and write data (output) using a standard and easy-to-use system. This system works with:

// Characters (like letters and words)

// Bytes (raw data like images, files, etc.)
// Main Components
// Type	Purpose	Examples
// Input Streams	To read data into the program	InputStream, BufferedReader, ObjectInputStream
// Output Streams	To write data from the program	OutputStream, PrintWriter, ObjectOutputStream
// Wrapper Classes (For Better Performance)
// These classes "wrap around" basic input/output classes to make them easier to use and faster:

// BufferedReader: Reads text efficiently

// BufferedWriter: Writes text efficiently

// PrintWriter: Writes formatted text easily (like System.out.println())
// Object I/O
// ObjectInputStream: Reads an object from a file

// ObjectOutputStream: Writes an object to a file

// This helps in saving and loading full Java objects (like storing data of a Student object).
import java.io.*;
public class SimpleIOExample{
    public static void main(String[] args) throws IOException{
        // writing a file
        FileWriter writer = new FileWriter("output.txt");
        writer.write("Hello ,java i/o");
        writer.close();

        //reader.close()
        BufferedReader reader = new BufferedReader(
            new FileReader(("output.txt")));
            String line = reader.readLine();
            System.out.println("File says:"+line);
            reader.close();
    }}


// Java I/O Classes – Reader and Writer
// What are they?
// Reader and Writer are two abstract classes in Java used for character-based input and output.
// They deal with text data (not binary).
// Belong to the java.io package.
import java.io.*;
public class ReaderWriterExample{
    public static void main(String[]args) throws IOException{
        // writing characters to a file
        Writer writer = new FileWriter("sample.txt");
        writer.write("nice my fremd ");
        writer.close();

        //Reading characters from a file
        Reader reader = new FileReader("sample.txt");
        int data ;
        while ((data = reader.read())!=-1){
            System.out.print((char)data);
        }
        reader.close();
    }
}


// The File class in Java allows you to perform operations on files and directories, such as creating, deleting, and checking if a file exists. The File class does not read or write data from files; it only handles the file metadata (like name, location, and existence).
// Key Methods in the File Class:
// createNewFile():
// Creates a new, empty file if it doesn’t already exist.
// Returns true if the file is created successfully, otherwise false.exists():

// Checks if the file or directory exists.

// Returns true if the file exists, otherwise false.
import java.io.*;
public class FileClassExample {
    public static void main(String[] args){
        // create  a file object to represent "my file.txt"
        File file = new File("MyFile.txt");
        try{
            // check if file exists
            if (file.exists()){
                System.out.println("file exists");
            }else{
                System.out.println("File not exists");
                // create file if not exist
                if(file.createNewFile()){
                    System.out.println("File created succesfully");
                }else{
                    System.out.println("Fil already there");
                }
            }
        } catch (IOException e){
            System.out.println("an erro occured"+e.getMessage());
        }
    }


    
}
