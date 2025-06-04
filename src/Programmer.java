public class Programmer extends Man {
    private int lvl;

    public Programmer(String name, int age, int lvl) {
        super(name, age);
        if (lvl < 0) {
            lvl = 0;
        }
        if (lvl > 100) {
            lvl = 100;
        }
        this.lvl = lvl;
    }

    public int getLvl() {
        return lvl;
    }

}
