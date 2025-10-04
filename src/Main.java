public class Main {
    public static void main(String[] args) {


        Game one = new Game();
        one.setBonus(true);
        one.getLevel(1).setGoalReached(true);
        one.getLevel(2).setGoalReached(true);
        one.getLevel(3).setGoalReached(true);
        one.getLevel(1).setPoints(200);
        one.getLevel(2).setPoints(100);
        one.getLevel(3).setPoints(500);

        System.out.println(one.getScore()); //2400

        Game two = new Game();
        one.setBonus(false);
        two.getLevel(1).setGoalReached(true);
        two.getLevel(2).setGoalReached(true);
        two.getLevel(3).setGoalReached(false);
        two.getLevel(1).setPoints(200);
        two.getLevel(2).setPoints(100);
        two.getLevel(3).setPoints(500);

        System.out.println(two.getScore()); //300

        Game three = new Game();
        three.setBonus(true);
        three.getLevel(1).setGoalReached(true);
        three.getLevel(2).setGoalReached(false);
        three.getLevel(3).setGoalReached(true);
        three.getLevel(1).setPoints(200);
        three.getLevel(2).setPoints(100);
        three.getLevel(3).setPoints(500);

        System.out.println(three.getScore()); //600

        Game four = new Game();
        four.setBonus(false);
        four.getLevel(1).setGoalReached(false);
        four.getLevel(2).setGoalReached(true);
        four.getLevel(3).setGoalReached(true);
        four.getLevel(1).setPoints(200);
        four.getLevel(2).setPoints(100);
        four.getLevel(3).setPoints(500);

        System.out.println(four.getScore()); //0

        Game five = new Game();
        System.out.println(five.playManyTimes(4)); //returns 90 if you input, scores 75, 50, 90 , 20

    }
}