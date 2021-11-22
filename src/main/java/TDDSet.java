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
        if (contains(element)) {
            return false;
        }
        this.elements[this.size] = element;
        this.size++;
        return true;
    }

    public int size() {
        return size;
    }

    public boolean contains(T element) {
        if (getIndex(element) != -1) {
            return true;
        }
        return false;
    }

    private int getIndex(T element) {
        for (int i = 0; i < this.elements.length; i++) {
            if (element == this.elements[i]) {
                return i;
            }
        }
        return -1;
    }

    public boolean remove(T element) {
        int index = getIndex(element);
        if (index != -1) {
            this.elements[index] = null;
            this.size--;
            return true;
        }
        return false;
    }
}
