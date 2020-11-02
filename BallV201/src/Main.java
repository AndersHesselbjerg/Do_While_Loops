import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static ArrayList<Ball> getBalls() {
        ArrayList<Ball> balls = new ArrayList<>();
        FootBall fb = new FootBall(3, "Select");
        balls.add(fb);
        TennisBall tb = new TennisBall(2, "Tretorn");
        balls.add(tb);
        //balls.add( new FootBall(3, "Wilson"));
        balls.add( new TennisBall(2, "Tretorn"));
        balls.add( new FootBall(4, "Adidas"));
        balls.add( new TennisBall(1, "Nike"));
        balls.add( new FootBall(3, "Wilson"));

        FootBall fbFind = new FootBall(3, "Wilson");
        //balls.add(fbFind);
        //System.out.println("Antal bold=" + balls.size());
        int i = balls.indexOf(fbFind);
        System.out.println("fundet = " + i);
        //System.out.println(balls);
        return balls;
    }

    public static ArrayList<Integer> getInts() {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(10);
        ints.add(20);
        ints.add(30);
        System.out.println(ints);
        Integer min = Collections.min(ints);
        int hs = min.hashCode();
        System.out.println("hashcode for 10," + hs);
        System.out.println("min=" + min);

        int prim1 = 3, prim2 = 13;
        Integer ii = prim1;
        int cp = ii.compareTo(prim2);
        System.out.println("min=" + cp);

        return ints;
    }

    public static void main(String[] args) {
        ArrayList<Ball> balls = getBalls();
        System.out.println(balls.size());

        Ball mindsteBold = Collections.min(balls);
        System.out.println("Min mindste bold er=" + mindsteBold);

        Collections.sort(balls);
        System.out.println("Min mindste bold er=" + mindsteBold);


        Collections.sort(balls);
        System.out.println(balls);

        //for(Ball b: balls) {
        for (int i = 0; i < balls.size() ; i++) {
            Ball b = balls.get(i);
            if (b.isTennisBall()) {
                balls.remove(b);

            }

        }


        ArrayList<TennisBall> tblist = new ArrayList<>();
        for (Ball b : balls) {
            if (b instanceof TennisBall) {
                tblist.add(TennisBall) b);

            }


        }
        System.out.println(tblist);
    }


    }



