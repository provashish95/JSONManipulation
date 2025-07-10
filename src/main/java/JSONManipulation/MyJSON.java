package JSONManipulation;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class MyJSON {
    public static void main(String[] args) throws IOException {
        JSONObject empObj = new JSONObject();

        empObj.put("name", "provashish");
        empObj.put("designation", "SQA");
        empObj.put("address", "dhaka");


        JSONObject hobbyObj = new JSONObject();

        hobbyObj.put("language-1", "C programming");
        hobbyObj.put("language-2", "JavaScript");
        hobbyObj.put("language-3", "Java");

        empObj.put("hobby", hobbyObj);

        //System.out.println(empObj);

        FileWriter fw = new FileWriter("./src/main/resources/employee.json");

        fw.write(empObj.toJSONString());
        fw.flush();
        fw.close();

    }
}
