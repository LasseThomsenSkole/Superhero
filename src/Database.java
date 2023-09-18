import java.util.ArrayList;
import java.util.Scanner;

public class Database {
    ArrayList<Superhero> superheroList;
    Scanner keyboard = new Scanner(System.in);

    public Database() {

        superheroList = new ArrayList<>();

        //dummy superheroes
        Superhero superheroTest = new Superhero("abe", "kat", "kaste bananer", 2003, "nej", 12.1);
        Superhero superheroTest2 = new Superhero("troldmand", "john", "kaste ild", 225, "ja", 9001);
        Superhero superheroTest3 = new Superhero("supermand", "kaste frost", 2000, "nej", 12.1);
        superheroList.add(superheroTest);
        superheroList.add(superheroTest2);
        superheroList.add(superheroTest3);


    }

    public void addSuperhero() {

        System.out.println("Indtast kaldenavn");
        String superName = keyboard.next();

        System.out.println("Indtast rigtige navn");
        String realName = keyboard.next();

        System.out.println("Indtast superkræft");
        String superpower = keyboard.next();

        System.out.println("Indtast fødselsår");
        //Input mismatch håndtering
        while (!keyboard.hasNextInt()) {
            System.out.println("du skal skrive et hel tal: ");
            keyboard.next();
        }
        int birthYear = keyboard.nextInt();

        String isHuman = null;
        while (isHuman == null) {
            System.out.println("Er din superhelt et menneske? [ja/nej]");

            String erMenneskeInput = keyboard.next();

            if (erMenneskeInput.equals("ja")) {
                isHuman = "er menneske";
            } else if (erMenneskeInput.equals("nej")) {
                isHuman = "er ikke menneske";

            }
        }

        double strength;
        System.out.println("Indtast styrketal");
        while (!keyboard.hasNextDouble()) {
            System.out.println("du skal angive et tal:");
            keyboard.next();
        }
        strength = keyboard.nextDouble();

        //add superhelten til arrayListen
        superheroList.add(new Superhero(superName, realName, superpower, birthYear, isHuman, strength));

        System.out.println(superheroList + " blev oprettet");


    }

    public Superhero searchSuperhero(String searchInput) {

        ArrayList<String> heroes = new ArrayList<>();

        System.out.println("Søgning: ");

        //foreach loop som sammenligner søgning med superheroes på superheroList
        for (Superhero superhero : superheroList) {

            if (superhero.getName().toLowerCase().contains(searchInput.toLowerCase())) {
                if (!heroes.contains(superhero.getName())) {
                    heroes.add(superhero.getName());

                    //superheroInfo(superhero);

                    return superhero;

                }
                if(heroes.isEmpty()){
                    System.out.println("ikke fundet");
            }
            }
        }
        return null;
    }



    public ArrayList<Superhero> searchSuperheroMultiple(String search) {
        ArrayList<Superhero> searchResult = new ArrayList<>();


        for (Superhero superhero : superheroList) {
            if (superhero.getName().contains(search)) {
                searchResult.add(superhero);
            }
        }
        System.out.println(searchResult);
        return searchResult;
    }



    public void superheroInfo(Superhero superhero) {
        System.out.println("Superheltens navn: " + superhero.getName());
        System.out.println("Superheltens rigtige navn: " + superhero.getRealName());
        System.out.println("Superheltens superkræft: " + superhero.getSuperPower());
        System.out.println("Superheltens fødselsår: " + superhero.getYearCreated());
        System.out.println("Er superhelten menneske?  " + superhero.getIsHuman());
        System.out.println("Superheltens styrke:  " + superhero.getStrength());
    }



    public void edit() {
        System.out.println("søg efter personen du ville redigere: ");
        String editInput = keyboard.nextLine();

        ArrayList<Superhero> editSearchResult = searchSuperheroMultiple(editInput);
        Superhero superheroToBeEdited = null;
        int choiceInput;

        if (editSearchResult.size() == 0) {
            System.out.println("Superhelt blev ik fundet");

        } else if (editSearchResult.size() > 1) {
            System.out.println("vælg person");
            int count = 1;
            for (Superhero superhero : editSearchResult) {
                System.out.println(count++ + ". " +
                        superhero.getName() + " " +
                        superhero.getRealName() + " " +
                        superhero.getSuperPower() + " " +
                        superhero.getYearCreated() + " " +
                        superhero.getIsHuman() + " " +
                        superhero.getStrength()
                );
            }

            choiceInput = keyboard.nextInt();   //fix
            keyboard.nextLine(); //bug
            superheroToBeEdited = editSearchResult.get(choiceInput - 1);
        } else {
            superheroToBeEdited = editSearchResult.get(0);
        }

        if (superheroToBeEdited != null) {
            System.out.println("Rediger superhelt. Tryk Enter hvis du ikke ville ændre værdien.");
            String newValue;

            System.out.println("Navn: " + superheroToBeEdited.getName());
            newValue = keyboard.nextLine();
            if (!newValue.isEmpty()) {
                superheroToBeEdited.setName(newValue);
            }

            System.out.println("rigtige navn: " + superheroToBeEdited.getRealName());
            newValue = keyboard.nextLine();

            if (!newValue.isEmpty()) {
                superheroToBeEdited.setRealName(newValue);
            }


            System.out.println("Superkræft: " + superheroToBeEdited.getSuperPower());
            newValue = keyboard.nextLine();
            if (!newValue.isEmpty()) {
                superheroToBeEdited.setSuperPower(newValue);
            }

            System.out.println("Fødselsår: " + superheroToBeEdited.getYearCreated());

            newValue = keyboard.nextLine();

            if (!newValue.isEmpty()) {
                superheroToBeEdited.setYearCreated(Integer.parseInt(newValue));
            }


            System.out.println("Er superhelten menneske? " + superheroToBeEdited.getIsHuman());
            newValue = keyboard.nextLine();
            if (!newValue.isEmpty()) {
                superheroToBeEdited.setIsHuman(newValue);
            }

            System.out.println("Superheltens styrketal: " + superheroToBeEdited.getStrength());
            newValue = keyboard.nextLine();
            if (!newValue.isEmpty()) {
                superheroToBeEdited.setStrength(Double.parseDouble(newValue));
            }

            System.out.println(superheroToBeEdited + "er redigeret");
        }
    }
}

