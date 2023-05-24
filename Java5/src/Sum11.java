import java.util.ArrayList;

public class Sum11 {
    //11. Declare global variables of your name, Add all your group names in list, using
    //for each loop iterate and print ONLY your name.


    static String v = "Vidhi";

    public static void main(String[] args) {
        div();


    }
    public static void div(){

        ArrayList<String> groupMember = new ArrayList<>();

        groupMember.add("Situ");
        groupMember.add("Vidhi");
        groupMember.add("Hiral");
        groupMember.add("Meet");
        groupMember.add("Dhawal");
        groupMember.add("Hemi");


        for (String a : groupMember) {
            System.out.println("My name is :" +v);

        }


    }
}
