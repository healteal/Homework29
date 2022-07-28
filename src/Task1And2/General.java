package Task1And2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class General {
    public static void main(String[] args) {
        Buyer buyer1 = new Buyer("Irina",45,Type.VIP);
        Buyer buyer2 = new Buyer("Ivan",30,Type.MEDIUM);
        Buyer buyer3 = new Buyer("Vladislav",76,Type.STANDARD);
        Buyer buyer4 = new Buyer("Kiryl", 75,Type.VIP);

        Comparator<Buyer> comparator = (o1, o2) -> {
            if (o1.getAge() == o2.getAge() && o1.getName().equals(o2.getName()) && o1.getType().equals(o2.getType())) {
                return 0;
            }
            if (o2.getAge() > 60 && (o1.getAge() < 60 && o1.getType().equals(Type.VIP))) {
                return 1;
            }
            if (o2.getType().equals(Type.VIP) && o1.getAge() < 60) {
                return 1;
            }
            return -1;
        };
        PriorityQueue<Buyer> collection = new PriorityQueue<>(comparator);
        collection.add(buyer1);
        collection.add(buyer2);
        collection.add(buyer3);
        collection.add(buyer4);
        System.out.println(collection);
        Buyer.removeVIPUsers(collection);
        System.out.println(collection);
    }
}
