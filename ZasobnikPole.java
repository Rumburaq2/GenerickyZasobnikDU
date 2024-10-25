import java.util.Arrays;

public class ZasobnikPole<T> {

    private T[] arr;
    private int index;

    public ZasobnikPole(int size) {
        this.arr = (T[]) new Object[size];
        this.index = -1; //prvni polozke inkrementuje a da prvni prvek na index 0
    }

    public void push(T param) {
        this.index++;
        arr[this.index] = param;
    }

    public T pop() {
        T elem = arr[index];
        arr[index] = null;
        this.index--;
        return elem;
    }

    @Override
    public String toString() {
        return "ZasobnikPole{" +
                "arr=" + Arrays.toString(arr) +
                ", index=" + index +
                '}';
    }
}
