import java.util.ArrayList;

public class list {
    public static void main(String args[]){
        String e="rukia";
        String b="ichigo";
        ArrayList<String> myList = new ArrayList<>();
        myList.add(e);
        myList.add(b);
        int x=myList.indexOf(e);
        System.out.println(x);
        System.out.println(myList.size());
    }
}
