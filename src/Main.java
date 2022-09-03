public class Main {
    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor("Гарри", "Поттер", 50, 6, 5, 4, 3);
        Griffindor germionaGreindzher = new Griffindor("Гермиона", "Грейнджер", 15, 7, 28, 35, 80);
        Griffindor ronUizli = new Griffindor("Рон", "Уизли", 25, 17, 80, 50, 5);

        Slizerin drakoMalfoi = new Slizerin("Драко", "Малфой", 4, 6, 7, 80, 15, 80, 25);
        Slizerin grahamMontegu = new Slizerin("Грэхэм", "Монтегю", 15, 8, 25, 80, 15, 17, 20);
        Slizerin gregoryGoyl = new Slizerin("Грегори", "Гойл", 25, 18, 5, 6, 80, 48, 60);

        Puffendui zahariaSmith = new Puffendui("Захария", "Смит", 12, 2, 50, 70, 90);
        Puffendui sedrickDiggori = new Puffendui("Седрик", "Диггори", 15, 25, 60, 40, 15);
        Puffendui justinFinchFletchly = new Puffendui("Джастин", "Финч-Флетчли", 20, 30, 6, 15, 70);

        Kogtevran chzhowChang = new Kogtevran("Чжоу", "Чан", 15, 20, 85, 90, 12, 99);
        Kogtevran padmaPatil = new Kogtevran("Падма", "Патил",7, 10, 15, 60, 20, 80);
        Kogtevran markusBelbi = new Kogtevran("Маркус", "Белби", 60, 20, 7, 80, 90, 17);

        harryPotter.printCharacteristics();
        zahariaSmith.printCharacteristics();
        chzhowChang.printCharacteristics();
        drakoMalfoi.printCharacteristics();

        compareStudents(harryPotter, germionaGreindzher);
        compareStudents(drakoMalfoi, grahamMontegu);
        compareStudents(zahariaSmith, sedrickDiggori);
        compareStudents(chzhowChang, padmaPatil);

        compareAnyStudents(harryPotter, zahariaSmith);
    }

    public static void compareStudents(Griffindor h1, Griffindor h2) {
        if (h1.calcStudentPower() > h2.calcStudentPower()) {
            System.out.println(h1.getName() + " - лучший Гриффиндорец, чем " + h2.getName());
        } else {
            System.out.println(h2.getName() + " - лучший Гриффиндорец, чем " + h1.getName());
        }
    }

    public static void compareStudents(Slizerin h1, Slizerin h2) {
        if (h1.calcStudentPower() > h2.calcStudentPower()) {
            System.out.println(h1.getName() + " - лучший Слизеринец, чем " + h2.getName());
        } else {
            System.out.println(h2.getName() + " - лучший Слизиринец, чем " + h1.getName());
        }
    }

    public static void compareStudents(Puffendui h1, Puffendui h2) {
        if (h1.calcStudentPower() > h2.calcStudentPower()) {
            System.out.println(h1.getName() + " - лучший Пуффендуец, чем " + h2.getName());
        } else {
            System.out.println(h2.getName() + " - лучший Пуффендуец, чем " + h1.getName());
        }
    }

    public static void compareStudents(Kogtevran h1, Kogtevran h2) {
        if (h1.calcStudentPower() > h2.calcStudentPower()) {
            System.out.println(h1.getName() + " - лучший Когтевранец, чем " + h2.getName());
        } else {
            System.out.println(h2.getName() + " - лучший Когтевранец, чем " + h1.getName());
        }
    }

    public static void compareAnyStudents(Hogwarts h1, Hogwarts h2) {
        if (h1.calcPower() > h2.calcPower()) {
            System.out.println(h1.getName() + " - лучший Хогвардец, чем " + h2.getName());
        } else {
            System.out.println(h2.getName() + " - лучший Хогвардец, чем " + h1.getName());
        }
    }
}