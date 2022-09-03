public class Slizerin extends Hogwarts{
    private int tricky;
    private int resolute;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slizerin(String name, String surname, int witchcraft, int apparitionDisapparition, int tricky, int resolute, int ambition, int resourcefulness, int lustForPower) {
        super(name, surname, witchcraft, apparitionDisapparition);
        this.tricky = tricky;
        this.resolute = resolute;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getTricky() {
        return tricky;
    }

    public int getResolute() {
        return resolute;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void printCharacteristics() {
        printCommonFields();
        System.out.println(" tricky = " + tricky +
                " resolute = " + resolute +
                " ambition = " + ambition +
                " resourcefulness = " + resourcefulness +
                " lustForPower = " + lustForPower);
    }

    public int calcStudentPower() {
        return tricky + resolute + ambition + resourcefulness + lustForPower;
    }
}
