
package day26.discussion.hashmap;
import java.util.Set;
import java.util.Collection;
import java.util.Map;
import java.util.HashMap;
public class HashMapDiscussion {
     public static void main(String[] args) {
        
        Map<String, String> config = new HashMap<>();
        config.put("dbUrl", "http://localhost:3306/mydb");
        config.put("maxConnection", "50");
        config.put("appUrl", "https://hp4kmcgkrj.execute-api.us-east-2.amazonaws.com/production");
        
        if (config.containsKey("appUrl")) {
            System.out.println("Application is already hosted to AWS");
        }
        
        //config.clear();
        
        Set<String> keys = config.keySet();
        for(String key : keys) {
            System.out.println(key);
        }
        
        Collection configValues = config.values();
        for(Object configValue : configValues) {
            System.out.println(configValue);
        }
        
    }

}
