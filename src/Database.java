import java.util.ArrayList;
import java.util.Scanner;

public class Database {
    ArrayList<Superhero> superheroList;


    public Database() {
        superheroList = new ArrayList<>();
        Superhero superherotest = new Superhero("abe","kat","kaste bananer", 2003,"nej",12.1);
        superheroList.add(superherotest);


    }
    public void addSuperhero(){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Indtast kaldenavn");
        String superName = keyboard.next();

        System.out.println("Indtast rigtige navn");
        String realName = keyboard.next();

        System.out.println("Indtast superkræft");
        String superpower = keyboard.next();

        System.out.println("Indtast fødselsår");
        int birthYear = keyboard.nextInt();

        System.out.println("Er din superhelt et menneske? [ja/nej]");
        String erMenneskeInput = keyboard.next();
        String isHuman = null;

        if (erMenneskeInput.equals("ja")){
            isHuman = "er menneske";
        }else if (erMenneskeInput.equals("nej")){
            isHuman = "er ikke menneske";

        }

        System.out.println("Indtast styrketal");
        double strength = keyboard.nextDouble();

        superheroList.add(new Superhero(superName, realName, superpower, birthYear, isHuman, strength));

        System.out.println(superheroList);



    }
    public ArrayList<String> searchSuperhero(){
        System.out.println("Søgning: ");
        Scanner keyboard = new Scanner(System.in);

        String searchInput = keyboard.next();
        ArrayList<String> heroes = new ArrayList<>();
        boolean found = false;


        for (Superhero superhero:superheroList) {
            if(superhero.getName().toLowerCase().contains(searchInput.toLowerCase())){
                if(!heroes.contains(superhero.getName())){
                    heroes.add(superhero.getName());
                    superheroInfo(superhero);
                    found = true;
                }else if (!found){
                    System.out.println("Superhelt ikke fundet");

                }
            }
        }
        return heroes;
    }

    public void superheroInfo(Superhero superhero){
            System.out.println("Superheltens navn: " + superhero.getName());
            System.out.println("Superheltens rigtige navn: " + superhero.getRealName());
            System.out.println("Superheltens superkræft: " + superhero.getSuperPower());
            System.out.println("Superheltens fødselsår: " + superhero.getYearCreated());
            System.out.println("Er superhelten menneske?  " + superhero.getIsHuman());
            System.out.println("Superheltens styrke:  " + superhero.getStrength());


    }

}
