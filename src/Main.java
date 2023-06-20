import java.util.Random;

public class Main {
    // Описание задания лежит в классе TaskDescription

    public static void main(String[] args) {
     GryffindorStudent harry = GryffindorStudent.generateGryffindorStudent("Гарри Потер");
     GryffindorStudent hermione = GryffindorStudent.generateGryffindorStudent("Гермиона Грейнджер");
     GryffindorStudent ron = GryffindorStudent.generateGryffindorStudent("Рон Уизли");

     SlytherinStudent draco = SlytherinStudent.generateSlytherinStudent("Драко Малфой");
     SlytherinStudent graham = SlytherinStudent.generateSlytherinStudent("Грэхэм Монтегю");
     SlytherinStudent gregory = SlytherinStudent.generateSlytherinStudent("Грегори Гойл");

     HufflepuffStudent zechariah = HufflepuffStudent.generateHufflepuffStudent("Захария Смит");
     HufflepuffStudent cedric = HufflepuffStudent.generateHufflepuffStudent("Седрик Диггори");
     HufflepuffStudent justin = HufflepuffStudent.generateHufflepuffStudent("Джастин Финч-Флетчли");

     RavenclawStudent zhou = RavenclawStudent.generateRavenclawStudent("Чжоу Чанг");
     RavenclawStudent padma = RavenclawStudent.generateRavenclawStudent("Падма Патил");
     RavenclawStudent marcus = RavenclawStudent.generateRavenclawStudent("Маркус Белби");
     // вывод описания студентов
        System.out.println(" ==== вывод описания студентов ==========================");
        System.out.println(harry);
        System.out.println(hermione);
        System.out.println(ron);
        System.out.println(draco);
        System.out.println(graham);
        System.out.println(gregory);
        System.out.println(zechariah);
        System.out.println(cedric);
        System.out.println(justin);
        System.out.println(zhou);
        System.out.println(padma);
        System.out.println(marcus);
        System.out.println(" =========================================================");

        System.out.println(" === Сравнение учеников одного факультета между собой ====");
        harry.compareGryffindorToPrint(hermione);
        hermione.compareGryffindorToPrint(ron);

        draco.compareSlytherinToPrint(graham);
        graham.compareSlytherinToPrint(gregory);

        zechariah.compareHufflepuffToPrint(cedric);
        cedric.compareHufflepuffToPrint(justin);

        zhou.compareRavenclawToPrint(padma);
        padma.compareRavenclawToPrint(marcus);
        System.out.println(" =========================================================");

        System.out.println(" === Сравнение учеников разных факультетов между собой ===");
        hermione.compareHogwartsToPrint(graham);
        gregory.compareHogwartsToPrint(zechariah);
        justin.compareHogwartsToPrint(padma);
        padma.compareHogwartsToPrint(ron);
        System.out.println(" =========================================================");

    }

}