package JSONManipulation;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("./src/main/resources/test.txt");
        fw.write("Hello java and sqa");
        fw.close();
    }

}
