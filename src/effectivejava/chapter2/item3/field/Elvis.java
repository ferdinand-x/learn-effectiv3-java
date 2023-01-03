package effectivejava.chapter2.item3.field;

import java.util.List;
import java.util.Map;

// Singleton with public final field  (Page 17)
public class Elvis <T extends String,V extends Map<String,String>> {
    public static final Elvis INSTANCE = new Elvis();

    private T t;
    private V v;

    private Elvis() { }

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    // This code would normally appear outside the class!
    @SuppressWarnings(value = {"uchecked","redunant"})
    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();

        // Why generic array creation is illegal - won't compile!
        @SuppressWarnings(value = {"uchecked","redunant"})
        List<String>[] stringLists = new List[1]; // (1)
        List<Integer> intList = List.of(42); // (2)
        Object[] objects = stringLists; // (3)
        objects[0] = intList; // (4)
        String s = stringLists[0].get(0); // (5)
    }
}