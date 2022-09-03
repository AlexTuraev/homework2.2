public class Hogwarts {
    private String name;
    private String surname;
    private int witchcraft;
    private int apparitionDisapparition;

    public Hogwarts(String name, String surname, int witchcraft, int apparitionDisapparition) {
        this.name = name;
        this.surname = surname;
        this.witchcraft = witchcraft;
        this.apparitionDisapparition = apparitionDisapparition;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public int getApparitionDisapparition() {
        return apparitionDisapparition;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void printCommonFields() {
        System.out.print(name + " " + surname + ": " +
                "Witchcraft = " + witchcraft +
                " ApparitionDisapparition = " + apparitionDisapparition);
    }
    public int calcPower() {
        return witchcraft + apparitionDisapparition;
    }
}
