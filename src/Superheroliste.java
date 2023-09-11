import java.util.Arrays;

public class Superheroliste {
    int count = 0;
    Superhero[] Superheroliste;
    public Superheroliste() {
        this.Superheroliste = new Superhero[5];
    }
    public void tilføjSuperhero(String name, String realName, String superPower, int yearCreated, boolean isHuman, double strength){
        Superheroliste[count++] = new Superhero(name, realName, superPower, yearCreated, isHuman, strength);
    }

    @Override
    public String toString() {
        return "Superheroliste{" +
                "nr." + count +
                Arrays.toString(Superheroliste) +
                '}';
    }
}
