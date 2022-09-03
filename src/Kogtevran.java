public class Kogtevran extends Hogwarts{
    private int smart;
    private int wisdom;
    private int wit;
    private int creativity;

    public Kogtevran(String name, String surname, int witchcraft, int apparitionDisapparition, int smart, int wisdom, int wit, int creativity) {
        super(name, surname, witchcraft, apparitionDisapparition);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void printCharacteristics() {
        printCommonFields();
        System.out.println(" smart = " + smart +
                " wisdom = " + wisdom +
                " wit = " + wit +
                " creativity = " + creativity);
    }

    public int calcStudentPower() {
        return smart + wisdom + wit + creativity;
    }
}
