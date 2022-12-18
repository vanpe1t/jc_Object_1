public class Main {
    public static void main(String[] args) {
        Human maxim = new Human("Максим", 1988, "Минск", "");
        Human ann = new Human("Аня", 1993, "Москва", "");
        Human kate = new Human("Катя", 1992, "Калининград", "");
        Human arty = new Human("Артем", 1995, "Артем", "");

        System.out.println(maxim);
        System.out.println(ann);
        System.out.println(kate);
        System.out.println(arty);

        maxim.setJobTitle("бренд-менеджер");
        ann.setJobTitle("методист образовательных программ");
        kate.setJobTitle("продакт-менеджер");
        arty.setJobTitle("директор по развитию бизнеса");

        System.out.println(maxim);
        System.out.println(ann);
        System.out.println(kate);
        System.out.println(arty);

        Human johnDoe = new Human("", -1, "", "");
        System.out.println(johnDoe);

    }
}

