package tempaccount.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.*;
import com.google.gson.reflect.*;


        


public class ExtractWeather {
    
    public static Map<String, Object> jsonToMap(String str){
        Map<String, Object> map = new Gson().fromJson(str, new TypeToken<HashMap<String, Object>>() {}.getType());
        return map;
    }
    
    public static void main(String[] args){
        String API_KEY = "c5d6edf27201932d2b73692bb7a64170";
        String LOCATION = "St John's,NL";
        String urlString = "http://api.openweathermap.org/data/2.5/weather?q=" + LOCATION + "&appid-" + API_KEY + "&units = metric";
        try{
            StringBuilder result = new StringBuilder();
            URL url = new URL(urlString);
            URLConnection conn = url.openConnection();
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while((line = rd.readLine()) != null){
                result.append(line);
            }
            rd.close();
            System.out.println(result);
            
            Map<String, Object> respMap = jsonToMap(result.toString());
            Map<String, Object> mainMap = jsonToMap(respMap.get("main").toString());
            Map<String, Object> windMap = jsonToMap(respMap.get("wind").toString());
            
            
            
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
