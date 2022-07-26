package Task1And2;

import java.util.PriorityQueue;

public class General {
    public static void main(String[] args) {
        Buyer buyer1 = new Buyer("Irina",45,Type.VIP);
        Buyer buyer2 = new Buyer("Ivan",30,Type.MEDIUM);
        Buyer buyer3 = new Buyer("Vladislav",76,Type.STANDARD);
        Buyer buyer4 = new Buyer("Kiryl", 75,Type.VIP);

        PriorityQueue<Buyer> collection = new PriorityQueue<>();
        collection.add(buyer1);
        collection.add(buyer2);
        collection.add(buyer3);
        collection.add(buyer4);
        collection.comparator();
        System.out.println(collection);
        Buyer.removeVIPUsers(collection);
        System.out.println(collection);
    }
}
