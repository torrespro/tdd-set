public class TDDSet<T> {

    private Object[] elements;
    private int size;

    public TDDSet() {
        this.elements = new Object[10];
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean add(T element) {
        this.elements[this.size] = element;
        this.size++;
        return true;
    }

    public int size() {
        return size;
    }

    public boolean contains(T element) {
        for (int i = 0; i < this.elements.length; i++) {
            if (element == this.elements[i]) {
                return true;
            }
        }
        return false;
    }

    public boolean remove(T element) {
        return false;
    }
}
