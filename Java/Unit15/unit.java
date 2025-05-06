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




// The FileWriter class in Java is used to write data to files. It is a part of the java.io package and provides various constructors to create file-writing objects. Here's a simple breakdown of the FileWriter class and its constructors:

// Constructors of FileWriter:
// FileWriter(File file):
// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;

// public class FileCreateCheck {
//     public static void main(String[] args) throws IOException {
//         // Step 1: Create a File object (this does not create the file yet)
//         File file = new File("example.txt");

//         // Step 2: Create a FileWriter object to write to the file
//         FileWriter writer = new FileWriter(file);

//         // Step 3: Write some text to the file
//         writer.write("Hello, World!");

//         // Step 4: Close the FileWriter to save changes and release resources
//         writer.close();

//         System.out.println("Data written to file successfully.");
//     }
// }

// FileWriter(File file, boolean append):
// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;

// public class FileCreateCheck {
//     public static void main(String[] args) throws IOException {
//         // Step 1: Create a File object
//         File file = new File("example.txt");

//         // Step 2: Create a FileWriter object with append mode enabled
//         FileWriter writer = new FileWriter(file, true); // true means append mode

//         // Step 3: Write text to the file
//         writer.write("Appending this text.");

//         // Step 4: Close the writer to save changes and release resources
//         writer.close();

//         System.out.println("Data appended to file successfully.");
//     }
// }
// FileWriter(FileDescriptor fd):
// import java.io.*;

// public class FileWriterWithFD {
//     public static void main(String[] args) throws IOException {
//         // Step 1: Create a FileOutputStream to get FileDescriptor
//         FileOutputStream fos = new FileOutputStream("example_fd.txt");

//         // Step 2: Get the FileDescriptor from the FileOutputStream
//         FileDescriptor fd = fos.getFD();

//         // Step 3: Create FileWriter using the FileDescriptor
//         FileWriter writer = new FileWriter(fd);

//         // Step 4: Write to the file
//         writer.write("Written using FileDescriptor.\n");

//         // Step 5: Flush and close both
//         writer.flush(); // Ensures data is sent to file
//         fos.close(); // Also closes the file writer indirectly

//         System.out.println("Data written using FileDescriptor.");
//     }
// }

// FileWriter(String fileName):
// import java.io.FileWriter;
// import java.io.IOException;

// public class FileWriterExample {
//     public static void main(String[] args) {
//         try {
//             // Create a FileWriter for the file named "note.txt"
//             FileWriter writer = new FileWriter("note.txt");

//             // Write text to the file
//             writer.write("This file was created using FileWriter(String fileName).\n");

//             // Close the writer
//             writer.close();

//             System.out.println("Data written successfully.");
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }

// FileWriter(String fileName, boolean append):
import java.io.FileWriter;
import java.io.IOException;

public class AppendFileExample {
    public static void main(String[] args) {
        try {
            // Open or create file, and append to it
            FileWriter writer = new FileWriter("log.txt", true);

            // Write additional text
            writer.write("This line is appended.\n");

            // Close the writer
            writer.close();

            System.out.println("Data appended successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


// Writing Character Data in a Text File using the FileWriter Class
// import java.io.FileWriter;
// import java.io.IOException;

// public class AppendFileExample {
//     public static void main(String[] args) {
//         try {
//             // Step 1: Create a FileWriter object for the file "output.txt"
//             FileWriter writer = new FileWriter("output.txt");  // overwrites existing content

//             // Step 2: Write character data to the file
//             writer.write("Hello, this is sample text.\n");
//             writer.write("Writing character data using FileWriter.\n");

//             // Step 3: Close the writer to save and free resources
//             writer.close();
//             System.out.println("Data written successfully to output.txt");
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }
//If You Want to Append Instead:
import java.io.FileWriter;
import java.io.IOException;

public class AppendFileExample {
    public static void main(String[] args) {
        try {
            // Step 1: Create a FileWriter object for the file "output.txt"
            FileWriter writer = new FileWriter("output.txt", true);  // true enables append mode


            // Step 2: Write character data to the file
            writer.write("Hello, this is sample text.\n");
            writer.write("Writing character data using FileWriter.\n");

            // Step 3: Close the writer to save and free resources
            writer.close();
            System.out.println("Data written successfully to output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// 📘 What is FileReader?
// FileReader is used to read character data from a file. It is suitable for text files (like .txt files).

// ✅ Common Constructors of FileReader:
// Constructor	Description
// FileReader(File file)	Reads from a file using a File object
// FileReader(String fileName)	Reads from a file using just the file name as a string
// FileReader(FileDescriptor fd)	Reads from a file using a low-level file descriptor
import java.io.FileReader;
import java.io.IOException;
public class AppendFileExample {
public static void main(String[] args){
    try{
         // Step 1: Create FileReader object using file name
         FileReader reader = new FileReader("output.txt");
          // Step 2: Read character by character
          int character;
          System.out.println("reading file content");
          while ((character = reader.read())!=-1){
            System.out.print((char)character);// convert int to char and print
        }
         // Step 3: Close the reader
         reader.close();
    
          }catch (IOException e){
            e.printStackTrace();
          }
    }
}


// shows how to read characters from a file using the FileReader class
import java.io.FileReader;
import java.io.IOException;

public class AppendFileExample {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("output.txt");
            int character;

            System.out.println("Reading file content:");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character); // print without newline
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



// Reading Data from a File using the FileReader Class
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        // Step 1: Create a FileReader object for the file "output.txt"
        try (FileReader reader = new FileReader("output.txt")) {
            // Step 2: Read the file content character by character
            int character;
            System.out.println("Reading file content:");
            
            // Step 3: Read each character until the end of file (EOF)
            while ((character = reader.read()) != -1) {
                // Step 4: Print the character read
                System.out.print((char) character); // Typecast int to char for printing
            }
        } catch (IOException e) {
            // Handle potential IOException
            e.printStackTrace();
        }
    }
}
