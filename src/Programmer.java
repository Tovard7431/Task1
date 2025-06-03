public class Programmer extends Man {
    private int lvl;

    Programmer(String name, int age, int lvl) {
        super(name, age);
        this.lvl = lvl;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int programmersLvl) {
        if (programmersLvl < 0) {
            lvl = 0;
            programmersLvl = 0;
        }
        if (programmersLvl > 100) {
            lvl = 100;
            programmersLvl = 100;
        } else {
            lvl = programmersLvl;
        }
    }
}
