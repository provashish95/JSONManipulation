package JSONManipulation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SearchJSONArrayList {
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        JSONArray empArray = (JSONArray) jsonParser.parse(new FileReader("./src/main/resources/emp.json"));
        JSONObject empObj = new JSONObject();
        boolean isFound = false;
        for (Object obj : empArray) {

            empObj= (JSONObject) obj;
            //String id= (String) empObj.get("id");
            String id = empObj.get("id").toString();

            if (id.equals("103")) {
                isFound = true;
                break;
            }
        }

        if(isFound){
            System.out.println(empObj);
        }else{
            System.out.println("Not found");
        }

    }
}
