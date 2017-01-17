package visitorsIdentification;

/**
 * Created by Администратор on 16.01.2017.
 */
public class Main {
    public static void main(String[] args) {

        Checker security = new Checker(20); // созадем список для всех посетителей

        // возможные посетители

        TechnicalStaff tecPerson = new TechnicalStaff("Евкакий");
        TechnicalStaff tecPerson2 = new TechnicalStaff("Галя");

        Guest irina = new Guest("Ирина");
        Guest fedya = new Guest("Фёдр");
        Guest vasya = new Guest("Василий");
        Guest sveta = new Guest("Светлана");
        Guest eva = new Guest("Ева");
        Guest dron = new Guest("Андрей");

        Student petya = new Student("Петя", "ОО-22");
        Student masha = new Student("Маша", "ИИ-23");

        Lecturer nina = new Lecturer("Нина", "Старший преподаватель", "Ядерная физика");
        Lecturer vika = new Lecturer("Вика", "Профессор", "Физика твердого тела");

        Visitors evilVisitors[] = new Visitors[10];
        for (int i = 0; i < evilVisitors.length; i++) {
            evilVisitors[i] = (Visitors) new Student("Какой то студент" + i, "из какой то группы");
        }


        // посетители, которым был выдан временный пропуск
        tecPerson.authorization(irina);
        tecPerson.authorization(vasya);
        tecPerson.authorization(eva);
        tecPerson.authorization(sveta);

        System.out.println("Посетителю Ирине вход разрешен? " + security.check((Visitors) irina));
        System.out.println("Посетителю Фёдору вход разрешен? " + security.check((Visitors) fedya));
        System.out.println("Посетителю Василию вход разрешен? " + security.check((Visitors) vasya));
        System.out.println("Посетителю Светлане вход разрешен? " + security.check((Visitors) sveta));
        System.out.println("Посетителю Еве вход разрешен? " + security.check((Visitors) eva));
        System.out.println("Посетителю Андрею вход разрешен? " + security.check((Visitors) dron));

        System.out.println("Посетителю Евкакию вход разрешен? " + security.check((Visitors) tecPerson));
        System.out.println("Посетителю Гале вход разрешен? " + security.check((Visitors) tecPerson2));
        System.out.println("Посетителю Пете вход разрешен? " + security.check((Visitors) petya));
        System.out.println("Посетителю Маше вход разрешен? " + security.check((Visitors) masha));
        System.out.println("Посетителю Нине вход разрешен? " + security.check((Visitors) nina));
        System.out.println("Посетителю Вике вход разрешен? " + security.check((Visitors) vika));

        for (Visitors x : evilVisitors) {
            System.out.println("Посетителю " + x.getName() + " вход разрешен? " + security.check(x));
        }


        // отобразить список всех, кто прошел через систему охраны
        security.showVisitorsList();
    }
}
