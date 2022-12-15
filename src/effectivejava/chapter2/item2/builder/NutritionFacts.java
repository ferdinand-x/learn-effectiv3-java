package effectivejava.chapter2.item2.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

// Builder Pattern  (Page 13)
@Data
@Builder
@AllArgsConstructor
public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static void main(String[] args) {
        NutritionFacts cocaCola =  NutritionFacts.builder()
                .calories(100).sodium(35).carbohydrate(27).build();
        System.out.println(cocaCola);
    }
}