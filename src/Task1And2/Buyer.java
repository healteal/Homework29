package Task1And2;

import java.util.Collection;

public class Buyer {
    private final String name;
    private final int age;
    private final Type type;

    public Buyer(String name, int age, Type type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type=" + type +
                '}';
    }

    public static void removeVIPUsers(Collection<Buyer> collection) {
        collection.removeIf(next -> next.getType().equals(Type.VIP));
    }
}
