import java.util.Arrays;

public class Superheroliste {

    //fejl med count
    int count = 1;
    Superhero[] Superheroliste;
    public Superheroliste() {
        this.Superheroliste = new Superhero[5];
    }
    public void tilføjSuperhero(String name, String realName, String superPower, int yearCreated, boolean isHuman, double strength){
        Superheroliste[count++] = new Superhero(name, realName, superPower, yearCreated, isHuman, strength);
        count += 1;
    }


    public String toString() {
        return "Superheroliste{" +
                "nr." + count +
                Arrays.toString(Superheroliste) +
                '}';
    }
}
