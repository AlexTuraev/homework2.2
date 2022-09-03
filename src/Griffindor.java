public class Griffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, String surname, int witchcraft, int apparitionDisapparition, int nobility, int honor, int bravery) {
        super(name, surname, witchcraft, apparitionDisapparition);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void printCharacteristics() {
        printCommonFields();
        System.out.println(" Nobility = " + nobility +
                " Honor = " + honor +
                " Bravery = " + bravery);
    }

    public int calcStudentPower() {
        return nobility + honor + bravery;
    }
}
