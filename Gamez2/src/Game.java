public class Game {

    public static void main(String[] args) {

        // Laver jeg en virkelig terning
        Dice dice = new Dice();
        dice.value = 5;

        Dice dice2 = new Dice();
        dice2.value = 6;

        System.out.println(dice.value + dice2.value);


        Player claus = new Player();


        claus.roll();


    }

}
