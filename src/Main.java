//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Programmer p1 = new Programmer("Серёга", 25, 100);
        Programmer p2 = new Programmer("Сэм", 25, 1);
        Programmer p3 = new Programmer("Петя", 28, -100);
        Programmer p4 = new Programmer(null, 25, 1);

        compareProgrammers(p1, p2);
        compareProgrammers(p2, p1);
        compareProgrammers(p3, p3);
        compareProgrammers(p3, p4);

        Programmer[] programmers = {p1, p2, p3};

        System.out.println();
        sout(programmers);
    }

    public static boolean equalsMan (Man m1, Man m2){
        return (m1.equals(m2));
    }

    public static void sout (Programmer[] men ){
        for(int i = 0; i < men.length; i++ ){
            System.out.println(men[i]);
        }
    }

    public static void compareProgrammers(Programmer p1, Programmer p2) {
        int lvlDifference = p1.getLvl() - p2.getLvl();

        String S = "Программист с именем %s и возрастом %s круче программиста с именем %s и возрастом %s на %s уровней.";
        if (equalsMan(p1,p2)) {
            System.out.println(String.format("Сравниваемые программисты являются одним человеком c именем %s, возрастом %s и уровнем %s.", p1.getName(), p1.getAge(), p1.getLvl()));
        } else {
            if (lvlDifference > 0) {
                System.out.println(String.format(S, p1.getName(), p1.getAge(), p2.getName(), p2.getAge(), lvlDifference));
            } else if (lvlDifference < 0) {
                System.out.println(String.format(S, p2.getName(), p2.getAge(), p1.getName(), p1.getAge(), Math.abs(lvlDifference)));
            } else {
                System.out.println(String.format("Программисты %s  и %s находятся на одном уровне.", p1.getName(), p2.getName()));
            }
        }
    }
}