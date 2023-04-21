import java.util.ArrayList;
import java.util.Scanner;
class status{
    private ArrayList<String> locationcells;

    public void setLocationCells(ArrayList<String> locs){
        locationcells=locs;
    }
    public String checkYouself(String userInput){
        String result = "miss";
        int index = locationcells.indexOf(userInput);
        if(index>=0){

            locationcells.remove(index);

            if(locationcells.isEmpty()){
                result = "KILL";
            }else{
                result = "Hit";
            }
        }
        return result;
    }
}
public class prototype1 {
    public static void main(String args[]){
        String y="Hit";
        String x="KILL";
        
        int sink=0;
        int chance=0;
        System.out.println("Hello world!");
            Scanner sc = new Scanner(System.in);
            status check = new status();
            while(sink!=3){
            System.out.print("Your guess: ");
            String n = sc.nextLine();

            if(y==check.checkYouself(n)){
                System.out.println("Perfecto");
                sink++;
            }
            
            else{
                System.out.println("Try again");  
            }
            chance++;
            }
            System.out.println("The total number of tries : "+chance);
    }
}
