package JSONManipulation;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JSONArrayList {
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        org.json.simple.JSONArray jsonArray = (org.json.simple.JSONArray) jsonParser.parse(new FileReader("./src/main/resources/emp.json"));

        JSONObject empObj = new JSONObject();
        empObj.put("name", "Roy");
        empObj.put("address", "Dhaka");
        empObj.put("passion", "SEO");

        //System.out.println(empObj);
        jsonArray.add(empObj);

        System.out.println(jsonArray);

        FileWriter fw = new FileWriter("./src/main/resources/emp.json");
        fw.write(jsonArray.toJSONString());
        fw.flush();
        fw.close();

    }
}
