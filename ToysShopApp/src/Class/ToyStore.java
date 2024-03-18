import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

public class ToyStore {
    private PriorityQueue<Toy> toys;
    private List<Toy> wonToys;
    private Random random;

    public ToyStore() {
        toys = new PriorityQueue<>(Comparator.comparingDouble(Toy::getFrequency).reversed());
        wonToys = new ArrayList<>();
        random = new Random();
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void updateToyFrequency(int toyId, double newFrequency) {
        Toy updatedToy = null;
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setFrequency(newFrequency);
                updatedToy = toy;
                break;
            }
        }
        toys.remove(updatedToy);
        toys.add(updatedToy);
    }

    public void playToys() {
        if (toys.isEmpty()) {
            System.out.println("There are no available toys to play with.");
            return;
        }

        for (Toy toy : toys) {
            int numWon = (int) ((toy.getFrequency() / 100) * toy.getQuantity());
            for (int i = 0; i < numWon; i++) {
                wonToys.add(toy);
            }
        }

        if (wonToys.isEmpty()) {
            System.out.println("No toys were won.");
            return;
        }

        Toy wonToy = wonToys.remove(random.nextInt(wonToys.size()));
        wonToy.decreaseQuantity();

        try (FileWriter writer = new FileWriter("won_toys.txt", true)) {
            writer.write(wonToy.toString() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("The won toy is: " + wonToy);
    }

    public void showAvailableToys() {
        if (toys.isEmpty()) {
            System.out.println("There are no available toys.");
            return;
        }

        System.out.println("Available toys:");
        for (Toy toy : toys) {
            System.out.println(toy);
        }
    }
}
