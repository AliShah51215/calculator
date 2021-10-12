package pizzainfo;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pizza> pizzas = Arrays.asList(
                new Pizza("Grated Mozzarella Pizza", true, Arrays.asList(Ingredients.MOZZARELLA), 1002),
                new Pizza("Parma", false, Arrays.asList(Ingredients.MOZZARELLA, Ingredients.HAM), 1250),
                new Pizza("WholeGrain Salami", false, Arrays.asList(Ingredients.MOZZARELLA, Ingredients.SALAMI), 1391),
                new Pizza("Capri", true, Arrays.asList(Ingredients.MOZZARELLA, Ingredients.MUSHROOMS), 1212),
                new Pizza("Pisa Pizza", true, Arrays.asList(Ingredients.MOZZARELLA, Ingredients.TOMATO), 1250),
                new Pizza("Classic Ham And Mushroom Pizza", false, Arrays.asList(Ingredients.MOZZARELLA, Ingredients.HAM, Ingredients.MUSHROOMS), 1561),
                new Pizza("Quattro Formaggi", false, Arrays.asList(Ingredients.MOZZARELLA, Ingredients.HAM, Ingredients.SALAMI, Ingredients.MUSHROOMS), 1790),
                new Pizza("Metal Post Vegetarian", true, Arrays.asList(Ingredients.MOZZARELLA, Ingredients.TOMATO, Ingredients.MUSHROOMS, Ingredients.ONION, Ingredients.CELERY), 1420),
                new Pizza("Spicy Bites", false, Arrays.asList(Ingredients.MOZZARELLA, Ingredients.SALAMI, Ingredients.PEPPER), 1625),
                new Pizza("Supreme Pizza", false, Arrays.asList(Ingredients.MOZZARELLA, Ingredients.PEPPER, Ingredients.HAM, Ingredients.CELERY, Ingredients.ONION, Ingredients.MUSHROOMS, Ingredients.TOMATO), 1821)
        );

        PizzaInfo pizzaInfo = new PizzaInfo(pizzas);

        System.out.println("\n" + "Do all pizzas contain mozzarella?");
        System.out.println(pizzaInfo.ifAllPizzasContainMozzarella());

        System.out.println("\n" + "The most caloric pizza is: ");
        System.out.println(pizzaInfo.findHighestCaloriesPizza());

        System.out.println("\n" + "The least caloric pizza is: ");
        System.out.println(pizzaInfo.findLowestCaloriesPizza());
        System.out.println("Vegetarian Pizzas: ");
        pizzaInfo.printVegPizzas();

        System.out.println("\n" + "Pizzas with allergens: ");
        pizzaInfo.printPizzasWithAllergens();

        System.out.println("\n" + "pizza containing tomato and pepper?");
        System.out.println(pizzaInfo.isAnyVegPizzaWithTomatoAndPepper());
    }
}
