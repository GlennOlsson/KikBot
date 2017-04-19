

import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class ReadWrite {

	//Earlier RetrieveSetting.java
	public static String getKey(String key){
		try {
			JSONParser parser = new JSONParser();
			Object object = null;

			if(System.getProperty("os.name").toLowerCase().contains("windows")){
				object = parser.parse(new FileReader("C:\\Users\\Glenn\\Documents\\KikBot\\Secret.json"));
			}
			else if (System.getProperty("os.name").toLowerCase().contains("linux")) {
				object =  parser.parse(new FileReader("/home/pi/KikBot/Secret.json"));
			}

			JSONObject jsonObject = (JSONObject) object;

			return (String) jsonObject.get(key);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	//	@SuppressWarnings("unchecked")
	//	public static void setKey(String key, String value){
	//
	//		try {
	//			JSONParser parser = new JSONParser();
	//			Object object = null;
	//
	//			object = parser.parse(new FileReader("Files/settings.json"));
	//
	//			JSONObject jsonObject = (JSONObject) object;
	//
	//			jsonObject.put(key, value);
	//
	//			try (FileWriter file = new FileWriter("Files/settings.json")){
	//				file.write(jsonObject.toJSONString());
	//				new Print("Successfully wrote {\""+key+"\":\""+value+"\"}", false);
	//			}
	//
	//		} catch (Exception e) {
	//			new Logg(e, "setKey in RetrieveSettings", "Trying to setKey in settings.json", null);
	//		}
	//	}

}
