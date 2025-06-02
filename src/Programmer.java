public class Programmer extends Man {
    private int lvl;

    Programmer(int lvl) {
        this.lvl = lvl;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int programmersLvl) {
        if (programmersLvl < 0) {
            lvl = 0;
        }
        if (programmersLvl > 100) {
            lvl = 100;
        } else {
            lvl = programmersLvl;
        }
    }
}
    /*public Programmer(String name, int age, int lvl) {
        this.setName(name);
        this.setAge(age);
        this.setLvl(lvl);
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("lvl: " + lvl);
    }

    public Programmer() {
        this.setName("Amir");
        this.setAge(0);

    }*/
}
