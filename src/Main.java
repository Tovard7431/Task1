//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Programmer programmer0 = new Programmer("Серёга", 25, 100);
        Programmer programmer1 = new Programmer("Сэм", 25, 1);
        Programmer programmer2 = new Programmer("Петя", 28, -100);
        Programmer programmer3 = new Programmer("Сэм", 25, 1);
        System.out.println(programmer0.equals(programmer1));
        System.out.println(programmer1.equals(programmer0));
        System.out.println(programmer2.equals(programmer2));
        System.out.println(programmer1.equals(programmer3));
        int programmer0sLvl = programmer0.getLvl();
        int programmer1sLvl = programmer1.getLvl();
        int programmer2sLvl = programmer2.getLvl();
        if (programmer0sLvl < programmer1sLvl) {
            System.out.println("Программист с именем " + programmer1.getName() + " и возрастом " + programmer1.getAge() + " круче программиста с именем " + programmer0.getName() + " и возрастом " + programmer0.getAge() + " на " + (programmer1sLvl - programmer0sLvl) + " уровней.");
        } else {
            System.out.println("Программист с именем " + programmer0.getName() + " и возрастом " + programmer0.getAge() + " круче программиста с именем " + programmer1.getName() + " и возрастом " + programmer1.getAge() + " на " + (programmer0sLvl - programmer1sLvl) + " уровней.");
        }
    }
}
