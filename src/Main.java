import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //menu input
        Scanner keyboard = new Scanner(System.in);
        int menuInput;
        Database database = new Database();

        //programloop

        do {
            System.out.println("1. opret 9. afslut");
            menuInput = keyboard.nextInt();
            switch (menuInput) {
                case 1:
                    database.tilføjSuperhero();

                    break;

                case 9:
                    System.exit(123);
            }

        } while (true);


    }
}