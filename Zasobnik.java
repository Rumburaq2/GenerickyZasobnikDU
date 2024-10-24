import java.util.ArrayList;

public class Zasobnik<T> {

    private ArrayList<T> arrayList = new ArrayList<T>();

    public void push(T param){
        arrayList.add(param);
    }
    public T pop(){
        return arrayList.remove(arrayList.size()-1);
    }

    @Override
    public String toString() {
        return "Zasobnik{" +
                "arrayList=" + arrayList +
                '}';
    }
}
