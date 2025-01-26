public class Waifu  <T extends String, N extends Number> {

    private T name;
    private N age;
    private T type;

    public Waifu(T name, N age, T type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public N getAge() {
        return age;
    }

    public void setAge(N age) {
        this.age = age;
    }

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }
}
