package Examples;

import java.util.HashMap;
import java.util.Map;

public class CityMain {
public static void main(String[] args) {

    Map<City,String> map = new HashMap<>();
    map.put(new City("Delhi"),"Polluted");
    map.put(new City("Bangalore"),"Traffic");
    map.put(new City("Gurgaon"),"CyberHub");
    map.put(new City("Mumbai"),"Crowded");
    System.out.println(map.get(new City("Delhi")));
}
}

