import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //menu input
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1. opret 9. afslut");
        int menuInput = keyboard.nextInt();
        //programloop
        while (menuInput != 9) {
            if(menuInput == 1) {

                Superheroliste database = new Superheroliste();

                System.out.println("indtast kaldenavn, rigtige navn, superkræft, årstal, om det er et menneske og styrketal");

                database.tilføjSuperhero(keyboard.next(), keyboard.next(), keyboard.next(), keyboard.nextInt(), keyboard.nextBoolean(), keyboard.nextDouble());
                System.out.println(database.toString());
            }

            {
                break;
            }

        }

    }
}