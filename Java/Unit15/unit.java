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
    }}

import java.io.File;
import java.io.IOException;
public class FileCreateCheck{
    public static void main(String[] args){
        try{
            // Step 1: Create a File object with the file name "MyFile.txt"
            // This does NOT create the file on the disk yet
            File file = new File("Myfile.txt");
             // Step 2: Check if the file already exists on the disk
             if(file.exists()){
                // If file exists, print a confirmation message
                System.out.println("file already exist");
             }else{
                 // Step 3: Try to create a new file
                // createNewFile() returns true if the file is created successfully
                if(file.createNewFile()){
                    System.out.println("file not created");
                }
             }
        } catch(IOException e){
            // Handle any IO errors (e.g., permission issues, disk errors)
            System.out.println("error occured while handling the file");
            e.printStackTrace();
        }
    }
}

// What happens in the first and second execution?
// 📌 First Execution
// exists() → returns false (file not found).

// createNewFile() → creates the file and returns true.

// Now the file exists on disk.

// 📌 Second Execution
// exists() → returns true (file already exists).

// createNewFile() → returns false (won’t create again).

// File is already on the disk.
import java.io.File;
import java.io.IOException;

public class FileCreateCheck {
    public static void main(String[] args) throws IOException { // Add 'throws IOException'
        // Step 1: Create a File object (this does not create the actual file yet)
        File file = new File("Myfile.txt");

        // Step 2: Check if the file exists before creating
        if (file.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }

        // Step 3: Try to create the file
        if (file.createNewFile()) {
            System.out.println("File created successfully.");
        } else {
            System.out.println("File was not created (it already exists).");
        }

        // Step 4: Check again whether the file exists after the create attempt
        if (file.exists()) {
            System.out.println("File exists after createNewFile() attempt.");
        } else {
            System.out.println("File still does not exist.");
        }
    }
}

// Creating a directory is like creating a file — you first create a File object.

// Then, you call the .mkdir() method to actually create the directory on the disk.

// It returns true if the directory is successfully created, and false if it already exists or if there's an error (like no permission or invalid path).
import java.io.File;
public class FileCreateCheck {
    public static void main(String[] args){
        // Step 1: Create a File object with directory name
        File directory =new File("MyDirectory");
        // Step 2: Check if it already exists
        if(directory.exists()){
            System.out.println("exists ");
        }else{
            // Try to create the directory
            if(directory.mkdir()){
                System.out.println("could not created");
            }
        }
          // Final Step: Confirm the directory exists
          if(directory.exists()){
            System.out.println("d present now");
          }
    }}

// Concept Summary (Simple Words):
// Java's File class has two useful methods:

// renameTo(File dest): Renames the current file to a new name (or moves it).

// delete(): Deletes the file from the disk.

// These operations return true if successful, otherwise false.
import java.io.File;
import java.io.IOException;

public class FileCreateCheck {
    public static void main(String[] args) throws IOException {
        // Step 1: Create a file named "old_file.txt"
        File oldFile = new File("old_file.txt");

        if (!oldFile.exists()) {
            oldFile.createNewFile(); // Create file only if it doesn't exist
            System.out.println("old_file.txt created");
        }

        // Step 2: Rename "old_file.txt" to "newfile.txt"
        File newFile = new File("newfile.txt");

        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed to newfile.txt");
        } else {
            System.out.println("File rename to newfile.txt failed");
        }

        // Step 3: Delete "newfile.txt"
        if (newFile.delete()) {
            System.out.println("newfile.txt deleted successfully");
        } else {
            System.out.println("File deletion failed");
        }
    }
}


//The list() method in Java's File class is used to list all the files and directories inside a specified directory. It returns an array of String containing the names of the files and directories. This method can be used to search for files by checking for specific file names or patterns.
import java.io.File;

public class FileCreateCheck {
    public static void main(String[] args) {
        // Step 1: Create a File object for the directory where we want to search
        File directory = new File("C:\\Users\\E-LIBRARY-15\\OneDrive\\Desktop\\nkp");

        // Step 2: Use list() method to get a list of file names in the directory
        String[] files = directory.list();

        // Step 3: Check if directory is empty or contains files
        if (files != null) {
            // Step 4: Loop through and print file names
            System.out.println("List of files in the directory:");
            for (String fileName : files) {
                System.out.println(fileName);
            }
        } else {
            // If the directory doesn't exist or is empty
            System.out.println("Directory is empty or does not exist.");
        }
    }
}

// Method	Return Type	Description
// createNewFile()	boolean	Creates a new empty file if it doesn't already exist.
// delete()	boolean	Deletes the file or directory with the given name.
// exists()	boolean	Checks if the file or directory exists.
// isDirectory()	boolean	Checks if the path refers to a directory.
// isFile()	boolean	Checks if the path refers to a file.
// list()	String[]	Returns names of files and directories in the specified directory.
// mkdir()	boolean	Creates a directory with the given name.
// renameTo(File dest)	boolean	Renames the file to the specified destination name.
