import java.util.ArrayList;

public class Dictionary<K, V, P extends Pair<K, V>> {
    private ArrayList<P> pares;

    public Dictionary() {
        this.pares = new ArrayList<>();
    }

    public void add(P par) {
        this.pares.add(par);
    }

    public boolean delete(K key) {
        for (P par : this.pares) {
            if (par.getKey().equals(key)) {
                this.pares.remove(par);
                return true;
            }
        }
        return false;
    }

    V getValue(K key) {
        try {
            for (P par : this.pares) {
                if (par.getKey().equals(key)) {
                    return par.getValue();
                }
            }
            throw new ObjectNoExist("No existe el par con la clave " + key);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (P par : this.pares) {
            result += par.toString() + "\n";
        }
        return result;
    }
}
