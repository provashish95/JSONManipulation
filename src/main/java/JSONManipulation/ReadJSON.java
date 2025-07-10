package JSONManipulation;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class ReadJSON {
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        JSONObject empObj = (JSONObject) jsonParser.parse(new FileReader("./src/main/resources/employee.json"));

        //System.out.println(empObj); //Print JSONObject not normal Object

        String name = empObj.get("name").toString();
        String designation = empObj.get("designation").toString();
        String hobby = empObj.get("hobby").toString();
        System.out.println(name);
        System.out.println(designation);

        System.out.println(hobby); //get hobby Object

        JSONObject hobbyObj = (JSONObject) empObj.get("hobby"); //Convert to JSONObject
        String language = hobbyObj.get("language-2").toString();
        System.out.println(language);

    }
}
