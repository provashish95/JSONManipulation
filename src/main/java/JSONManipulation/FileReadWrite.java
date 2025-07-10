package JSONManipulation;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {
    public static void main(String[] args) throws IOException {

        //writeFile("./src/main/resources/test.txt", true);
        readFile("./src/main/resources/test.txt");

    }

    public static void writeFile(String filename, boolean append) throws IOException {

        FileWriter fw = new FileWriter(filename, append);

        fw.write("\n");
        fw.write("Hello java");
        fw.close();
    }

    public static void readFile(String fileUrl) throws IOException {
        FileReader fr = new FileReader(fileUrl);

        int character;
        while((character = fr.read()) != -1) {
            System.out.print((char)character);
        }
    }

}
