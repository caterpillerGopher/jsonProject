package jsonproject.jsonproject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException, IOException, ParseException
    {
    	JSONParser parser = new JSONParser();
    	Object obj = parser.parse(new FileReader("/GOPHER/jsonproject/src/resource/java/jsonproject/json.json"));
    	JSONObject jsonObject = (JSONObject) obj;
    	System.out.println(jsonObject.get("port"));
    	System.out.println(jsonObject.get("backend"));
    	JSONArray api =  (JSONArray) jsonObject.get("api");
    	
       for(int i=0; i < api.size(); i++ ) {
    	JSONObject api1 =  (JSONObject) api.get(i);
    	System.out.println(api1.get("apitype"));
    	JSONObject api2 =  (JSONObject) api1.get("header");
    	Set<?> keys = api2.keySet();
    	
    	    Iterator<?> a = keys.iterator();
    	    while(a.hasNext()) {
    	    	String key = (String)a.next();
    	        // loop to get the dynamic key
    	        String value = (String)api2.get(key);
    	        System.out.print("key : "+key);
    	        System.out.println(" value :"+value);
    	        
    	        
    	    }
     }
    }
    	   
    	   
}
