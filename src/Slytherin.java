public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, String surname, int powerOfMagic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, surname, powerOfMagic, transgression);

        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    public void showSlytherinInfo() {
        super.showStudentInfo();
        System.out.println(this.cunning + " " + this.determination + " " + this.ambition + " " + this.resourcefulness
                + " " + this.thirstForPower);
    }

    public void compareRSlytherin(Slytherin s1, Slytherin s2) {
        int amount1 = s1.cunning + s1.determination + s1.ambition + s1.resourcefulness + s1.thirstForPower;
        int amount2 = s2.cunning + s2.determination + s2.ambition + s2.resourcefulness + s2.thirstForPower;
        if (amount1 > amount2) {
            System.out.println(s1.getName() + " лучший на Слизерин, чем " + s2.getName());
        } else {
            System.out.println(s2.getName() + " лучший на Слизерин, чем " + s1.getName());

        }
    }
}
