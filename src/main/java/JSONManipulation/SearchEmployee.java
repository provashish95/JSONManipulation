package JSONManipulation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class SearchEmployee {
    public static void main(String[] args)throws IOException, ParseException {
        JSONObject empObj = getEmpoyeeData("102");
        System.out.println(empObj.get("name"));
    }

    public static JSONObject getEmpoyeeData(String empId)throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        JSONArray empArray = (JSONArray) jsonParser.parse(new FileReader("./src/main/resources/emp.json"));


        for (Object obj : empArray) {
            JSONObject empObj= (JSONObject) obj;
            String id= (String) empObj.get("id");

            //long id = (long) empObj.get("id");
            //String id = empObj.get("id").toString();

            if (id.equals(empId) ) {
                return empObj;
            }
        }
        return new JSONObject();
    }

}
