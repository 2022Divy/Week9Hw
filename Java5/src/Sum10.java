import java.util.ArrayList;

public class Sum10 {
    //10. Write program and add all group members names in to array and iterates
    //through for each loop and print your name.

    public static void main(String[] args) {
        mem();

    }
    public static void mem(){

        ArrayList<String> groupMember = new ArrayList<>();

        groupMember.add("Situ");
        groupMember.add("Vidhi");
        groupMember.add("Hiral");
        groupMember.add("Meet");
        groupMember.add("Dhawal");
        groupMember.add("Hemi");


        for (String a :groupMember) {
            System.out.println("My name is :" +groupMember.get(1));

        }


        }
}
