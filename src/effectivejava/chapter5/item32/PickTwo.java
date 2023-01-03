package effectivejava.chapter5.item32;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

// Subtle heap pollution (Pages 147-8)
public class PickTwo {
    // UNSAFE - Exposes a reference to its generic parameter array!
    static <T> T[] toArray(T... args) {
        return args;
    }

    static <T> T[] pickTwo(T a, T b, T c) {
        switch(ThreadLocalRandom.current().nextInt(3)) {
            case 0: return toArray(a, b);
            case 1: return toArray(a, c);
            case 2: return toArray(b, c);
        }
        throw new AssertionError(); // Can't get here
    }

    public static void main(String[] args) {
        Object[] objects = pickTwo("Good", "Fast", "Cheap");
        String[] strings = (String[]) pickTwo("Good", "Fast", "Cheap");
        System.out.println(Arrays.toString(objects));
        System.out.println(Arrays.toString(strings));
    }
}
