//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Programmer p1 = new Programmer("Серёга", 25, 100);
        Programmer p2 = new Programmer("Сэм", 25, 1);
        Programmer p3 = new Programmer("Петя", 28, -100);
        Programmer p4 = new Programmer("Сэм", 25, 1);
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p1));
        System.out.println(p3.equals(p3));
        System.out.println(p2.equals(p4));
        int programmer1sLvl = p1.getLvl();
        int programmer2sLvl = p2.getLvl();
        int programmer3sLvl = p3.getLvl();
        compareProgrammers(p1, p2);
        compareProgrammers(p2, p1);
        compareProgrammers(p3, p3);

        Programmer[] programmers = new Programmer[3];
        programmers[0] = p1;
        programmers[1] = p2;
        programmers[2] = p3;
    }

    public static void compareProgrammers(Programmer p1, Programmer p2) {
        int lvlDifference = p1.getLvl() - p2.getLvl();
        if (p1.getName() == p2.getName() && p1.getLvl() == p2.getLvl()) {
            System.out.println("Сравниваемые программисты являются одним человеком c именем " + p1.getName() + ", возрастом " + p1.getAge() + " и уровнем " + p1.getLvl());
        } else {
            if (lvlDifference > 0) {
                System.out.println("Программист с именем " + p1.getName() + " и возрастом " + p1.getAge() +
                        " круче программиста с именем " + p2.getName() + " и возрастом " + p2.getAge() +
                        " на " + lvlDifference + " уровней.");
            } else if (lvlDifference < 0) {
                System.out.println("Программист с именем " + p2.getName() + " и возрастом " + p2.getAge() +
                        " круче программиста с именем " + p1.getName() + " и возрастом " + p1.getAge() +
                        " на " + Math.abs(lvlDifference) + " уровней.");
            } else {
                System.out.println("Программисты " + p1.getName() + " и " + p2.getName() + " находятся на одном уровне.");
            }
        }
    }
}


/* if (programmer0sLvl > programmer1sLvl) {
            System.out.println("Программист с именем " + p1.getName() + " и возрастом " + p1.getAge() + " круче программиста с именем " + p2.getName() + " и возрастом " + p2.getAge() + " на " + (programmer1sLvl - programmer2sLvl) + " уровней.");
        } else {
            System.out.println("Программист с именем " + p2.getName() + " и возрастом " + p2.getAge() + " круче программиста с именем " + p1.getName() + " и возрастом " + p1.getAge() + " на " + (programmer1sLvl - programmer1sLvl) + " уровней.");
       } */