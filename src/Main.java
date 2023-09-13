import java.util.Random;

public class Main {

    public static void main(String[] args) {


        Gryffindor harry = new Gryffindor(" Гарри", " Поттер", 95, 85, 80, 70, 95);
        Gryffindor hermione = new Gryffindor(" Гермиона", "Грейнджер", 70, 86, 48, 55, 88);
        Gryffindor ron = new Gryffindor(" Рон", " Уизли", 25, 45, 60, 35, 40);


        Hufflepuff zechariah = new Hufflepuff(" Захария", " Смит", 70, 25, 44, 55, 45);
        Hufflepuff cedric = new Hufflepuff(" Седрик", " Диггори", 70, 80, 70, 58, 48);
        Hufflepuff justin = new Hufflepuff(" Джастин", " Финч-Флетчли", 90, 58, 65, 45, 80);


        Ravenclaw zhou = new Ravenclaw("Чжоу", " Чанг", 40, 30, 42, 36, 51, 46);
        Ravenclaw padma = new Ravenclaw("Падма", " Патил", 100, 80, 90, 78, 85, 96);
        Ravenclaw marcus = new Ravenclaw("Маркус ", " Белби", 90, 50, 48, 56, 78, 68);


        Slytherin draco = new Slytherin("Драко", " Малфой", 100, 30, 100, 20, 100, 25, 100);
        Slytherin graham = new Slytherin("Грэхэм ", "  Монтегю", 55, 20, 30, 25, 36, 45, 55);
        Slytherin gregory = new Slytherin("Грегори ", "  Гойл ", 25, 20, 10, 15, 36, 45, 12);


        marcus.showStudentInfo();
        gregory.showStudentInfo();






    }
}
