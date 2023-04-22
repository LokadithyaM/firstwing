import java.util.ArrayList;
import java.util.Scanner;

class setup{
    int x;
    private String a ="JAVA";
    private String b ="Trojan";
    private String c ="google";
 
    ArrayList<String> my_list = new ArrayList<String>();

     void add(){
         my_list.add(a);
         my_list.add(b);
         my_list.add(c);  
    }
        
    String verify(int ch){
        if(ch==my_list.indexOf(a)){
            my_list.remove(a);
            return "Hit1";
        }
        if(ch==my_list.indexOf(b)){
            my_list.remove(b);
            return "Hit2";
        }
        if(ch==my_list.indexOf(c)){
            my_list.remove(c);
            return "Hit3";
        }
        return null;
    }
    
    
}
public class prototype1{
        public static void main(String args[]){
            int i=1;
            Scanner sc = new Scanner(System.in);
        
            setup s = new setup();
            
            s.add();
                do{
                    System.out.print("Your guess: ");
                    int a = sc.nextInt();
                    String y = s.verify(a);

                    if(y!=null){
                        System.out.println("Success "+y);
                    }else{
                        System.out.println("Try again");
                    }
                    i++;
            }while(i>=0);

    }
}