import java.util.Scanner;

public class Game
{
    private boolean isBonus;
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;

    /** Postcondition: All instance variables have been initialized. */

    public Game() {
        levelOne = new Level();
        levelTwo = new Level();
        levelThree = new Level();
    }

    public Level getLevel(int i) {
        if (i == 1) return levelOne;
        if (i == 2) return levelTwo;
        if (i == 3) return levelThree;
        return null;
    }

    /** Returns true if this game is a bonus game and returns false otherwise */
    public boolean isBonus()
    {
        return isBonus;
    }

    public void setBonus(boolean isBonus) {
        this.isBonus = isBonus;
    }
    /** Simulates the play of this Game (consisting of three levels) and updates all relevant * game data
     */
    public void play() {
        Level[] levels = { levelOne, levelTwo, levelThree };
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < levels.length; i++) {
            System.out.print("Enter points for level " + (i + 1) + ": ");
            int points = s.nextInt();
            levels[i].setPoints(points);

            System.out.print("Did you reach the goal for level " + (i + 1) + "? (true/false): ");
            boolean reached = s.nextBoolean();
            levels[i].setGoalReached(reached);
        }

        System.out.print("Is this a bonus game? (true/false): ");
        isBonus = s.nextBoolean();
    }

    /** Returns the score earned in the most recently played game, as described in part (a) */
    public int getScore()
    {
       int totalpoints = 0;
       Level[] levels = {levelOne, levelTwo, levelThree};

       for (Level level: levels) {
           if (level.goalReached()) {
               totalpoints += level.getPoints();
           } else {
               break;
           }
       }

       if (isBonus) {
           totalpoints *= 3;
       }

       return  totalpoints;
    }
    /** Simulates the play of num games and returns the highest score earned, as
     * described in part (b)
     * Precondition: num > 0
     */
    public int playManyTimes(int num)
    {
        int max = 0;
        for (int i = 0; i < num; i++) {
            play();
            int score = getScore();
            if (score > max) {
                max = score;
            }
        }
        return max;
    }
// There may be instance variables, constructors, and methods that are not shown.
}
