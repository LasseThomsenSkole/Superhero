import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //menu input
        Scanner keyboard = new Scanner(System.in);
        int menuInput;


        //programloop

        do {
            System.out.println("1. opret 9. afslut");
            menuInput = keyboard.nextInt();
            switch (menuInput) {
                case 1:
                    Superheroliste database = new Superheroliste();

                    System.out.println("indtast kaldenavn, rigtige navn, superkræft, årstal, om det er et menneske og styrketal");

                    database.tilføjSuperhero(keyboard.next(), keyboard.next(), keyboard.next(), keyboard.nextInt(), keyboard.nextBoolean(), keyboard.nextDouble());
                    System.out.println(database.toString());
                    break;

                case 2:
                    System.exit(0);
            }

        } while (menuInput != 9);


    }
}