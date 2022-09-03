public class Puffendui extends Hogwarts{
    private int hardworking;
    private int loyalty;
    private int honesty;

    public Puffendui(String name, String surname, int witchcraft, int apparitionDisapparition, int hardworking, int loyalty, int honesty) {
        super(name, surname, witchcraft, apparitionDisapparition);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void printCharacteristics() {
        printCommonFields();
        System.out.println(" Hardworking = " + hardworking +
                " Loyalty = " + loyalty +
                " Honesty = " + honesty);
    }

    public int calcStudentPower() {
        return hardworking + loyalty + honesty;
    }
}
