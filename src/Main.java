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

                    Database database = new Database();
                    
                    System.out.println("Indtast kaldenavn");
                    String kaldenavn = keyboard.next();
                    
                    System.out.println("Indtast rigtige navn");
                    String rigtigNavn = keyboard.next();
                    
                    System.out.println("Indtast superkræft");
                    String superkræft = keyboard.next();
                    
                    System.out.println("Indtast fødselsår");
                    int fødselsår = keyboard.nextInt();
                    
                    System.out.println("Er din superhelt et menneske? [ja/nej]");
                    String erMenneskeInput = keyboard.next();

                    boolean erMenneske = false;
                    if (erMenneskeInput.equals("ja")){
                        erMenneske = true;
                }else if (erMenneskeInput.equals("nej")){
                        erMenneske = false;
                    }
                    
                    System.out.println("Indtast styrketal");
                    double styrketal = keyboard.nextDouble();
                    
                    //System.out.println("indtast kaldenavn, rigtige navn, superkræft, årstal, om det er et menneske og styrketal");

                    
                    database.tilføjSuperhero(kaldenavn, rigtigNavn,superkræft,fødselsår, erMenneske, styrketal);
                    System.out.println(database.toString());
                    break;

                case 9:
                    System.exit(123);
            }

        } while (true);


    }
}