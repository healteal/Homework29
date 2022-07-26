package Task3;

import java.util.Comparator;
import java.util.Date;
import java.util.TreeMap;

public class General {
    public static void main(String[] args) {
        Comparator<Client> comparator = ((x1, x2) -> {
            if (x2.getPriority() == x1.getPriority() && x1.getAddress().equals(x2.getAddress())) {
                return 0;
            }
            if (x2.getPriority() > x1.getPriority()) {
                return -1;
            }
            return 1;
        });
        TreeMap<Client, String> server = new TreeMap<>(comparator);
        Date date = new Date();
        server.put(new Client("10.10.10", 2), date.toString());
        server.put(new Client("10.20.10", 1), date.toString());
        server.put(new Client("10.30.10", 4), date.toString());
        server.put(new Client("10.40.10", 1), date.toString());
        System.out.println(server);
    }
}
