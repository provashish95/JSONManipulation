package JSONManipulation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class ReadJSONArrayList {
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader("./src/main/resources/emp.json"));

        JSONObject empObj = (JSONObject) jsonArray.get(1);
        String name = empObj.get("name").toString();
        System.out.println(name);

        for (Object obj : jsonArray) {
            JSONObject jsonObject = (JSONObject) obj;
            //System.out.println(jsonObject);
            System.out.println(jsonObject.get("name"));
        }

    }
}
