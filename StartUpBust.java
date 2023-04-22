import java.util.ArrayList;

public class StartUpBust{
    private GameHelper helper = new GameHelper();
    private ArrayList<Startup> startups = new ArrayList<Startup>();
    private int nGuesses = 0;

    private void setUpgame(){
        Startup one = new Startup();
        one.setName("Poniez");
        Startup two = new Startup();
        two.setName("google");
        Startup three = new Startup();
        three.setName("adani");

        startups.add(one);
        startups.add(two);
        startups.add(three);

        System.out.println("Your goal is to Sink three Startups");
        System.out.println("poniez,google,adani");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for(Startup startup: startups){
            ArrayList<String> newLocation = helper.placeStartup(3);
            startup.setLocationCells(newLocation);
        }
    }

    private void startPlaying(){
        while(!startups.isEmpty()){
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess){
        nGuesses++;

        String result= "miss";
        for(Startup StartUpToTest:startups){
            result = StartUpToTest.checkYourself(userGuess);

            if(result == "hit"){
                break;
            }else if(result == "kill"){
                startups.remove(StartUpToTest);
            }
        }

        System.out.println(result);
    }

    private void finishGame(){
        System.out.println("ALl Startups are dead! Your stock is now worthless");
        if(nGuesses<=18){
            System.out.println("It only took you "+nGuesses+" guesses.");
            System.out.println("You got out before your options sank.");
        }else{
            System.out.println("Took you long enough. "+nGuesses+" guesses");
        }
    }
    public static void main(String args[]){
        System.out.println("Hell mama");
        StartUpBust game = new StartUpBust();
        game.setUpgame();
        game.startPlaying();
    }
}