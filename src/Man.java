import java.util.Objects;

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
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Man man)) {
            return false;
        }
        if (age != man.age) {
            return false;
        }
        if (!Objects.equals(name, man.name)) {
            return false;
        }
        if (name == null) {
            return false;
        } else {
            return true;
        }
    }
}
