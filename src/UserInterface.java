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
            System.out.println("1. opret 2. find en helt 3. find flere helte 9. afslut");
            menuInput = keyboard.nextInt();
            switch (menuInput) {
                case 1:
                    database.addSuperhero();

                    break;
                case 2:
                    database.searchSuperhero();

                    break;
                case 3:
                    System.out.println("søg: ");
                    String searchInput = keyboard.next();
                    database.searchSuperheroMore(searchInput);
                case 4:
                    System.out.println("Hvem vil du redigere? ");
                    database.edit();


            }

        } while (!(menuInput ==9));}
}

