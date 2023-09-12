import java.util.Arrays;

public class Database {

    //fejl med count
    int count = 1;
    Superhero[] Superheroliste;
    public Database() {
        this.Superheroliste = new Superhero[5];
    }
    public void tilføjSuperhero(String name, String realName, String superPower, int yearCreated, boolean isHuman, double strength){
        Superheroliste[count++] = new Superhero(name, realName, superPower, yearCreated, isHuman, strength);
        count += 1;
    }


    public String toString() {
        return "Superheroliste{"+Arrays.toString(Superheroliste)+'}';
    }
}
