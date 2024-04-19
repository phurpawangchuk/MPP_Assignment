package Assignment9.prob9;
import java.util.*;
import java.util.stream.Collectors;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type { MEAT, FISH, OTHER }

    @Override
    public String toString() {
        return name;
    }

    public static final List<Dish> menu =
            Arrays.asList( new Dish("pork", false, 800, Dish.Type.MEAT),
                           new Dish("beef", false, 700, Dish.Type.MEAT),
                           new Dish("chicken", false, 400, Dish.Type.MEAT),
                           new Dish("french fries", true, 530, Dish.Type.OTHER),
                           new Dish("rice", true, 350, Dish.Type.OTHER),
                           new Dish("season fruit", true, 120, Dish.Type.OTHER),
                           new Dish("pizza", true, 550, Dish.Type.OTHER),
                           new Dish("prawns", false, 400, Dish.Type.FISH),
                           new Dish("salmon", false, 450, Dish.Type.FISH));

    //a. Is there any Vegetarian meal available ( return type boolean)
    public static boolean isAnyVegetarianMeal(){
        return menu.stream().anyMatch(Dish::isVegetarian);
    }

    //b. Is there any healthy menu have calories less than 1000 ( return type boolean)
    public static boolean isHealthyMeal(){
        return menu.stream().filter(f ->f.getCalories()<1000).findAny().isPresent();
    }

    //c. Is there any unhealthy menu have calories greater than 1000 ( return type boolean)
    public static boolean unHealthyMeal(){
        return menu.stream().filter(f ->f.getCalories()>1000).findAny().isPresent();
    }

    //d. find and return the first item for the type of MEAT( return type Optional<Dish>)
    public static Optional<Dish> firstMeatItem(){
        return menu.stream().filter(t -> t.getType() == Type.MEAT).findFirst();
    }

    //e. calculateTotalCalories() in the menu using reduce. (return int)
    public static double calculateTotalCalories(){
//        return menu.stream().reduce(0, t -> t.getCalories());
        return 0.0;
    }

    //f. calculateTotalCaloriesMethodReference()in the menu using MethodReferences. (return int)
    public static double calculateTotalCaloriesMethodReference(){
//        return menu.stream().reduce(0, t -> t.getCalories());
        return 0.0;
    }


    public static void main(String[] args) {

        System.out.println(firstMeatItem().orElse(null));
    }
}

