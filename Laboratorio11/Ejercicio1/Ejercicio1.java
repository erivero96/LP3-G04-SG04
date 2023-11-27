import java.util.Arrays;
import java.util.Comparator;



public class CandyBags extends Bag<Goodies> {

    public CandyBags(int size) {
        super(size);
    }

    @Override
    public void add(Goodies obj) throws IsFull {
        for (int i = 0; i < this.count; i++) {
            if (this.list[i] != null && this.list[i].equals(obj)) {
                return;
            }
        }
        super.add(obj);
    }

    public Goodies cheapest() throws isEmpty {
        if (this.count == 0) {
            throw new isEmpty("La bolsa esta vacia");
        }

        Goodies cheapestGoodie = this.list[0];
        for (int i = 1; i < this.count; i++) {
            if (this.list[i].getPrice() < cheapestGoodie.getPrice()) {
                cheapestGoodie = this.list[i];
            }
        }
        return cheapestGoodie;
    }

    public CandyBags mostExpensive(int n) throws isEmpty {
        if (this.count == 0) {
            throw new isEmpty("La bolsa esta vacia");
        }

        if (n >= this.count) {
            return this;
        }

        CandyBags expensiveBags = new CandyBags(n);
        Goodies[] sortedGoodies = this.list.clone();
        Arrays.sort(sortedGoodies, Comparator.comparing(Goodies::getPrice).reversed());

        for (int i = 0; i < n; i++) {
            try {
                expensiveBags.add(sortedGoodies[i]);
            } catch (IsFull e) {
                // Handle the IsFull exception here
                System.out.println("Bag is full. Cannot add more items.");
            }
        }

        return expensiveBags;
        }
}
