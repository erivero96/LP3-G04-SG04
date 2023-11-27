
public class Bag <T> {
    protected T [] list;
    protected int count;
    public Bag(int size) {
        this.list = (T[]) new Object[size];
        this.count = 0;
    }

    public void add(T obj) throws IsFull {
        if (this.count == this.list.length) {
            throw new IsFull("La bolsa esta llena");
        }

        this.list[this.count] = obj;
        this.count++;
    }

    public T[] getObjects() throws isEmpty {
        if (this.count == 0) {
            throw new isEmpty("La bolsa esta vacia");
        }

        return this.list;
    }

    public void remove(T objeto) throws ObjectNoExist {
        for (int i = 0; i < this.count; i++) {
            if (this.list[i].equals(objeto)) {
                this.list[i] = null;
                this.count--;
                return;
            }
        }
        throw new ObjectNoExist("El objeto no existe");
    }

    public int getIndexOf(T objeto) throws ObjectNoExist {
        for (int i = 0; i < this.count; i++) {
            if (this.list[i].equals(objeto)) {
                return i;
            }
        }
        throw new ObjectNoExist("El objeto no existe");
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < this.count; i++) {
            result += this.list[i].toString() + "\n";
        }
        return result;
    }
}



