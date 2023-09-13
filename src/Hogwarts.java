import java.util.Random;

public class Hogwarts {
    private String name;
    private String surname;
    private  int transgression;
    private int powerOfMagic;


    public Hogwarts (String name, String surname, int powerOfMagic, int transgression){
        this.name = name;
        this.surname = surname;
        this.powerOfMagic = powerOfMagic;
        this.transgression = transgression;
    }

    public  String getName () {
        return this.name;
    }

    public void  setName (String name) {
        this.name = name;
    }

    public  String getSurname (){
        return surname;
    }

    public void setSurname (String surname){
        this.surname = surname;
    }

    public int getPowerOfMagic (){
        return powerOfMagic;
    }
    public void setPowerOfMagic(int powerOfMagic){
        this.powerOfMagic = powerOfMagic;
    }
    public int getTransgression(){
        return transgression;
    }
    public void setTransgression (int transgression){
        this.transgression = transgression;

    }

    public void showStudentInfo  (){
        System.out.println(name + " " + surname + " " + powerOfMagic + " " + transgression);
    }
    public int countCharacteristics (){
        powerOfMagic += transgression;
        return 0;
    }

    public int compareStudents (Hogwarts student1, Hogwarts student2){
       int power1 = student1.countCharacteristics();
       int power2 = student2.countCharacteristics();
       if (power1>power2){
           System.out.println(student1 + "обладает большей мощностью магии, чем" + student2);
       }else {
           System.out.println(student2 + "обладает большей мощностью магии, чем" + student1);
       }

        return power1;
    }
}
