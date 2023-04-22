import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameHelper {
    private static final String ALPHABET = "abcdefg";
    private static final int GRID_LENGTH = 7;
    private static final int GRID_SIZE = 49;
    private static final int MAX_ATTEMPTS = 200;
    static final int  HORIZONTAL_INCREMENT = 1;
    static final int VERTICAL_INCREMENT = GRID_LENGTH;


    private final int[] grid = new int [GRID_SIZE];
    private final Random random = new Random();
    private int startupCount = 0;

    public String getUserInput(String promt) {
        System.out.println(promt + ": ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine().toLowerCase();
    }
    public ArrayList<String> placeStartup(int startupsSize) {
        int [] startupCoords = new int[startupsSize];
        int attempts = 0;
        boolean success = false;

        startupCount++;
        int INREMENT = GET_INCREMENT();
        return null;
    }
    private int GET_INCREMENT() {
        if(startupCount%2==0){
            return HORIZONTAL_INCREMENT;
        }else{
            return VERTICAL_INCREMENT;
        }
    }



}
