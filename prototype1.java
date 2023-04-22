import java.util.ArrayList;
import java.util.Scanner;

class setup{
    int x;
    private String a ="JAVA";
    private String b ="Trojan";
    private String c ="google";
    ArrayList<String> my_list = new ArrayList<String>();
         

    void setup(){
         my_list.add(a);
         my_list.add(b);
         my_list.add(c);
    }

    void verify(){
        String s[]={"A1","A2","A3","A4","A5","A6","A7"};
        System.out.println(my_list);
    }

}
public class prototype1{
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        setup s = new setup();
        s.setup();
        s.verify();
    }
}