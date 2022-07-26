package Task3;

import java.util.Objects;

public class Client {
    private String address;
    private int priority;

    public Client(String address, int priority) {
        this.address = address;
        this.priority = priority;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Client{" +
                "address='" + address + '\'' +
                ", priority=" + priority +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return priority == client.priority && Objects.equals(address, client.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, priority);
    }
}
