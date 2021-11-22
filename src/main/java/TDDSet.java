public class TDDSet<T> {

    private Object[] elements;

    public TDDSet() {
        this.elements = new Object[]{};
    }

    public boolean isEmpty() {
        return this.elements.length == 0;
    }

    public boolean add(T element) {
        this.elements = new Object[] { element };
        return true;
    }
}
