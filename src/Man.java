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

    public void setName(String mansName) {
        if (mansName.isEmpty()) {
            name = "Амир";
        } else {
            name = mansName;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int mansAge) {
        if (mansAge < 0) {
            age = 0;
        }
        if (mansAge > 100) {
            age = 100
        } else {
            age = mansAge;
        }
    }
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
