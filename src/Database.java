import java.util.ArrayList;
import java.util.Scanner;

public class Database {
    ArrayList<Superhero> superheroList;
    Scanner keyboard = new Scanner(System.in);

    public Database() {

        superheroList = new ArrayList<>();

        //dummy superheroes
        Superhero superheroTest = new Superhero("abe","kat","kaste bananer", 2003,"nej",12.1);
        Superhero superheroTest2 = new Superhero("troldmand","john","kaste ild", 225,"ja",9001);
        Superhero superheroTest3 = new Superhero("supermand","kaste frost", 2000,"nej",12.1);
        superheroList.add(superheroTest);
        superheroList.add(superheroTest2);
        superheroList.add(superheroTest3);


    }
    public void addSuperhero(){

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
    public Superhero searchSuperhero(){

        System.out.println("Søgning: ");
        Scanner keyboard = new Scanner(System.in);

        String searchInput = keyboard.next();
        ArrayList<String> heroes = new ArrayList<>();

        //foreach loop som sammenligner søgning med superheroes på superheroList
        for (Superhero superhero:superheroList) {

            if(superhero.getName().toLowerCase().contains(searchInput.toLowerCase())){
                if(!heroes.contains(superhero.getName())){
                    heroes.add(superhero.getName());

                    superheroInfo(superhero);

                    return superhero;

                }
            }
        }
        return null;
    }

    public ArrayList<Superhero> searchSuperheroMore(String search){
        ArrayList<Superhero> searchResult = new ArrayList<>();


        for (Superhero superhero:superheroList) {
            if (superhero.getName().contains(search))   {
                searchResult.add(superhero);
            }
        }
        System.out.println(searchResult);
        return searchResult;
    }

    public void superheroInfo(Superhero superhero){
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

        ArrayList<Superhero> editSearchResult = searchSuperheroMore(editInput);
        Superhero superheroToBeEdit = null;
        int choiceInput = 0;

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

            choiceInput = keyboard.nextInt();
            keyboard.nextLine(); //bug
            superheroToBeEdit = editSearchResult.get(choiceInput - 1);
        } else {
            superheroToBeEdit = editSearchResult.get(0);
        }

        if(superheroToBeEdit != null){
            System.out.println("Rediger superhelt. Tryk Enter hvis du ikke ville ændre værdien.");
            String newValue;

            System.out.println("Navn: " + superheroToBeEdit.getName());
            newValue = keyboard.nextLine();
            if(!newValue.isEmpty()) {
                superheroToBeEdit.setName(newValue);
            }

            System.out.println("rigtige navn: " + superheroToBeEdit.getRealName());
            newValue = keyboard.nextLine();
            if(!newValue.isEmpty()){
                superheroToBeEdit.setRealName(newValue);
            }

            System.out.println("Superkræft: " + superheroToBeEdit.getSuperPower());
            newValue = keyboard.nextLine();
            if(!newValue.isEmpty()){
                superheroToBeEdit.setSuperPower(newValue);
            }

            System.out.println("Fødselsår: " + superheroToBeEdit.getYearCreated());
            newValue = keyboard.nextLine();
            if(!newValue.isEmpty()){
                superheroToBeEdit.setYearCreated(Integer.parseInt(newValue));
            }
            System.out.println("Er superhelten menneske? " + superheroToBeEdit.getIsHuman());
            newValue = keyboard.nextLine();
            if(!newValue.isEmpty()){
                superheroToBeEdit.setIsHuman(newValue);
            }
            System.out.println("Superheltens styrketal: " + superheroToBeEdit.getStrength());
            newValue = keyboard.nextLine();
            if(!newValue.isEmpty()){
                superheroToBeEdit.setStrength(Double.parseDouble(newValue));
            }
            System.out.println(superheroToBeEdit + "er redigeret");
            }
        }
    }

