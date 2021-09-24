package Animal;

public class Animal {
    private String name;
    private String race;
    private String age;
    private String color;

    public Animal(String name, String race, String age, String color) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", age='" + age + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Scooby", "labrador", "Seven", "Chocolate");
        Dog dog2 = new Dog("Bullet", "German Shepherd", "Five", "Black & Tan");
        System.out.println(dog1);
        System.out.println(dog2);
    }


}







