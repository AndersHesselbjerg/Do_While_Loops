import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static ArrayList
    public static void main (String[] args) {
        ArrayList<Ball> balls = new ArrayList<>();
        Football fb = new Football(3, "select");
        balls.add(fb);
        Tennisball tb = new Tennisball(  2, "Tretorn");
        balls.add(tb);

        balls.add(new Football(3, "Wilson"));
        balls.add(new Tennisball(2, "Tretorn"));
        balls.add(new Football(4, "Adidas"));
        balls.add(new Tennisball(1,"Nike"));
        Football fbFind = new Football(3, "Wilson");
        //balls.add(fbFind);


        System.out.println("Antal bold=" + balls.size());

        int i = balls.indexOf(fbFind);
        System.out.println("fundet = " + i);

        System.out.println(balls);
        return balls;


    }
    public static void main(String[] args) {
        ArrayList<Ball> balls = getBalls();
        System.out.println(balls.size());

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(10);
        ints.add(20);
        ints.add(30);
        System.out.println(ints);
        Integer min = Collections.min(ints);
        int hs = min.hashCode();
        System.out.println("hashcode for 10" + hs);
        System.out.println("min=" + min);

    }

    public static void main(String[] args) {
        ArrayList<Ball> balls = getBalls();
        System.out.println(balls.size());

        int prim1 = 3, prim2 = 3;
        Integer ii = prim1
        int cp 0 ii.compareTo(prim2);
        System.out.println("min=" + cp);
        System.out.println("min" = cp);


    }
}
