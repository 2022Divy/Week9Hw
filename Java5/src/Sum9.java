import java.util.ArrayList;

public class Sum9 {
    //9. Write program and add all group names in to array and iterates through for
    //each loop.

    public static void main(String[] args) {
        into();

    }
    public static void into(){

        ArrayList<String>groupMember = new ArrayList<>();

        groupMember.add("Situ");
        groupMember.add("Hiral");
        groupMember.add("Meet");
        groupMember.add("Dhawal");
        groupMember.add("Hemi");
        groupMember.add("Vidhi");

        for (String a :groupMember) {
            System.out.println(a);

        }

    }
}
