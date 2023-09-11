public class Superhero {
    String name;
    String realName;
    String superPower;
    int yearCreated;
    boolean isHuman;
    double strength;

    public Superhero(String name, String realName, String superPower, int yearCreated, boolean isHuman, double strength) {
        this.name = name;
        this.realName = realName;
        this.superPower = superPower;
        this.yearCreated = yearCreated;
        this.isHuman = isHuman;
        this.strength = strength;
    }

    public String toString() {
        return "Superhero{" +
                "name='" + name + '\'' +
                ", realName='" + realName + '\'' +
                ", superPower='" + superPower + '\'' +
                ", yearCreated=" + yearCreated +
                ", isHuman=" + isHuman +
                ", strength=" + strength +
                '}';
    }
}
