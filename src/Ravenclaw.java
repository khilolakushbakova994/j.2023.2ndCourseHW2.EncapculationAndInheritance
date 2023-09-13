public class Ravenclaw extends Hogwarts {
    public int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Ravenclaw(String name, String surname, int powerOfMagic, int transgression, int smart, int wise, int witty, int creativity) {
        super(name, surname, powerOfMagic, transgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public void showRavenclawInfo() {
        super.showStudentInfo();
        System.out.println(this.creativity + " " + this.wise + " " + this.witty + " " + this.smart);
    }

    public void compareRavenclaw(Ravenclaw r1, Ravenclaw r2) {
        int amount1 = r1.creativity + r1.wise + r1.witty + r1.smart;
        int amount2 = r2.creativity + r2.witty + r2.wise + r2.smart;
        if (amount1 > amount2) {
            System.out.println(r1.getName() + " лучший Гриффиндорец, чем " + r2.getName());
        } else {
            System.out.println(r2.getName() + " лучший Гриффиндорец, чем " + r1.getName());

        }
    }
}