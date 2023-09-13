public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, String surname, int powerOfMagic, int transgression, int nobility, int honor, int courage) {
        super(name, surname, powerOfMagic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public void showStudentInfo() {
        super.showStudentInfo();
        System.out.println(nobility + " " + honor + " " + courage);

    }
    public int countCharacteristics (){
        nobility += honor += courage;
        return 0;
    }


    public void compareGryffindor (Gryffindor g1, Gryffindor g2) {
        int amount1 = g1.countCharacteristics();
        int amount2 = g2.countCharacteristics();
        if (amount1 > amount2) {
            System.out.println(g1.getName() + " лучший Гриффиндорец, чем " + g2.getName());
        } else {
            System.out.println(g2.getName() + " лучший Гриффиндорец, чем " + g1.getName());


        }


    }
}
