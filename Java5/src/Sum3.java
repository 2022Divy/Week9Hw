import java.util.ArrayList;

public class Sum3 {
    //3. Write a Java program to create a new array list, add some colours(string) and
    //printout the collection using for each loop.


    public static void main(String[] args) {
        sub();

    }

    public static void sub(){

        ArrayList<String>Colours = new ArrayList<>();
        Colours.add("Pink");
        Colours.add("White");
        Colours.add("Red");
        Colours.add("Blue");
        Colours.add("Green");

        System.out.println(Colours);
        for (String a:Colours) {
            System.out.println(Colours);
            
        }

    }
}
