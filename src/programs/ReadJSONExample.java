package programs;
 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
 
public class ReadJSONExample
{
    public static void main(String[] args)
    {
    	
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader("US_Delivery_Address.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONArray employeeList = (JSONArray) obj;
            //To print complete JSON
//            System.out.println(employeeList);
            
            //To Print Size of JSON 
             System.out.println("****"+employeeList.size());
             
             JSONObject jo = null;
             
            for (int i = 0; i < employeeList.size(); i++) {
            	jo = (JSONObject) employeeList.get(i);
            	System.out.println("ServiceMethod :"+jo.get("service method"));
            	System.out.println("Full Address :"+jo.get("Full Address"));
            	System.out.println("Street :"+jo.get("Street"));
            	System.out.println("City :"+jo.get("City"));
            	System.out.println("State :"+jo.get("State"));
            	System.out.println("Street Name :"+jo.get("Street Name"));
            	System.out.println("Zipcode :"+jo.get("ZipCode"));
            	System.out.println("Store :"+jo.get("Store"));
			}
           
         } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
 

}