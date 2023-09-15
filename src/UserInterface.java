import java.util.Scanner;

public class UserInterface {
    public UserInterface(){

        }

    public void startprogram(){
        //menu input
        Scanner keyboard = new Scanner(System.in);
        int menuInput;
        Database database = new Database();

        //programloop

        do {
            System.out.println("1. opret 2. søg 9. afslut");
            menuInput = keyboard.nextInt();
            switch (menuInput) {
                case 1:
                    database.addSuperhero();

                    break;
                case 2:
                    database.searchSuperhero();


                    break;
                case 9:
                    System.exit(123);
            }

        } while (!(menuInput ==9));}
}

