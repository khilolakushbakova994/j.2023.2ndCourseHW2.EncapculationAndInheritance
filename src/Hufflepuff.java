public class Hufflepuff extends Hogwarts {
    public int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, String surname, int powerOfMagic, int transgression, int hardworking, int loyal, int honest) {
        super(name, surname, powerOfMagic, transgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public void showStudentInfo() {
        super.showStudentInfo();
        System.out.println(hardworking + " " + loyal + " " + honest);
    }

    public void compareHuffepuff (Hufflepuff h1, Hufflepuff h2) {
        int amount1 = h1.hardworking + h1.loyal + h1.honest;
        int amount2 = h2.hardworking + h2.loyal + h2.honest;
        if (amount1 > amount2) {
            System.out.println(h1.getName() + " лучший на факультете Пуффиндуй, чем " + h2.getName());
        } else {
            System.out.println(h2.getName() + " лучший на факультете Пуффиндуй, чем " + h1.getName());


        }


    }


}
