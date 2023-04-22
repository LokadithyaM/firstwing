import java.util.ArrayList;
import java.util.Scanner;

class setup{
    int x;
    int e[]={1,2,3,4,5,6};
    private String a ="JAVA";
    private String b ="Trojan";
    private String c ="google";
    ArrayList<String> my_list = new ArrayList<String>();
         

     private void setting_up(){
         my_list.add(a);
         my_list.add(b);
         my_list.add(c);
         System.out.println(my_list);
    }
    String verify(int a){
        return null;
    }
    void caller(){
        setting_up();
    }
    
}
public class prototype1{
        public static void main(String args[]){
            int i=1;
        Scanner sc = new Scanner(System.in);
        
        setup s = new setup();
        s.caller();


        while(i>0){
            System.out.print("Your guess: ");
            int a = sc.nextInt();
            String y = s.verify(a);
            if(y=="Hit"){
                System.out.println("You got that right");
            }
            i++;
        }
        
    }
}