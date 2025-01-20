public class Waifu<T, N> {

    private T name;
    private N age;

    public Waifu(T name, N age) {
        this.name = name;
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public N getAge() {
        return age;
    }
}
