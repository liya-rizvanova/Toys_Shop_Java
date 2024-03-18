public class Toy {
    private int id;
    private String name;
    private int quantity;
    private double frequency;

    public Toy(int id, String name, int quantity, double frequency) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public int getQuantity() {
        return quantity;
    }

    public void decreaseQuantity() {
        quantity--;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Frequency: " + frequency + "%";
    }

    public int getId() {
        return id;
    }
}
