import java.util.ArrayList;

public class Sum5 {
    //5. Write a Java program to test an array list is empty or not. Define array list with
    //underground tube names

    public static void main(String[] args) {
        multi();


    }
    public static void multi(){
        ArrayList<String> Tube= new ArrayList<String>();
        Tube.add("Harrow & Wealdstone");
        Tube.add("Kenton");
        Tube.add("Wembley");
        Tube.add("Ealing");
        Tube.add("Waterloo");
        System.out.println("Original array list: " + Tube);
        System.out.println("Checking the above array list is empty or not: "+Tube.isEmpty());
        Tube.removeAll(Tube);
        System.out.println("Array list after remove all elements "+Tube);
        System.out.println("Checking the above array list is empty or not: "+Tube.isEmpty());
    }


}
