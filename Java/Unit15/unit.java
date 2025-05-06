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