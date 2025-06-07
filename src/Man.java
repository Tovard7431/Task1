import java.util.Objects;

public class Man {
    private String name;
    private int age;

    public Man(String name, int age) {
        if (age < 0) {
            age = 0;
        }
        this.age = age;


        if (name == null || name.isEmpty()) {
            name = "Амир";
        }
        this.name = name;
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
        return age == man.age && Objects.equals(name, man.name);
    }

}
