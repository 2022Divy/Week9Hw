import java.util.ArrayList;
import java.util.Iterator;

public class Sum4 {
    //4. Write a Java program to iterate through all elements in an array list using
    //Iterator.
    public static void main(String[] args) {
        min();

    }
    public static void min(){
        ArrayList<String> Colours = new ArrayList<>();
        Colours.add("Pink");
        Colours.add("White");
        Colours.add("Red");
        Colours.add("Blue");
        Colours.add("Green");


        //for (String element:Colours) {
        //    System.out.println(element);
       // }
        Iterator<String> i = Colours.iterator();
        while (i.hasNext()){
            System.out.print(i.next());
            System.out.print(",");
        }

        }


}
