import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Database {

    public Database() {
        ArrayList<Superhero> superheroList = new ArrayList<>();



    }
    public void tilføjSuperhero(){
        Scanner keyboard = new Scanner(System.in);

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
        String menneskeStatus = null;
        if (erMenneskeInput.equals("ja")){
            menneskeStatus = "er menneske";
        }else if (erMenneskeInput.equals("nej")){
            menneskeStatus = "er ikke menneske";

        }

        System.out.println("Indtast styrketal");
        double styrketal = keyboard.nextDouble();

        Superhero superhero = new Superhero(kaldenavn, rigtigNavn, superkræft,fødselsår,menneskeStatus,styrketal);
        System.out.println(superhero);



    }


}
