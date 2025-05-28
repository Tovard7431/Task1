public class Man {
    private String name;
    private int age;

    Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Man))
            return false;
        Man man = (Man) obj;
        if (age != man.age)
            return false;
        if (name != null ? !name.equals(man.name) : man.name != null)
            return false;
    }
}

}
