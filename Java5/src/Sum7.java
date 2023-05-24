import java.util.HashMap;

public class Sum7 {
    //7. Create a HashMap object called people that will store String keys and Integer
    //values: And use for each loop to iterate the value from Map.
    public static void main(String[] args) {
        cross();


    }
    public static void cross(){
        HashMap<String, Integer>people = new HashMap<String, Integer>();
        
        people.put("Kavita",2);
        people.put("Heena",4);
        people.put("Alpa",6);
        people.put("Sejal",8);
        people.put("Kavya",10);

        System.out.println(people);

        for (Integer z:people.values()) {
            System.out.println(z);
            
        }
    }
}
