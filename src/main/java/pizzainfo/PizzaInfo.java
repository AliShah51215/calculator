package pizzainfo;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class PizzaInfo {
    private final List<Pizza> pizzas;

    public PizzaInfo(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public void printVegPizzas() {
        pizzas.stream()
                .filter(Pizza::isVegetarian)
                .forEach(System.out::println);
    }

    public void printPizzasWithAllergens() {
        pizzas.stream()
                .filter(p -> p.getIngredients().contains(Ingredients.CELERY))
                .forEach(System.out::println);
    }

    public boolean isAnyVegPizzaWithTomatoAndPepper() {
        return pizzas.stream()
                .filter(Pizza::isVegetarian)
                .anyMatch(p -> p.getIngredients().contains(Ingredients.CELERY) && p.getIngredients().contains(Ingredients.PEPPER));
    }

    public boolean ifAllPizzasContainMozzarella() {
        return pizzas.stream()
                .allMatch(p -> p.getIngredients().contains(Ingredients.MOZZARELLA));
    }

    public Pizza findHighestCaloriesPizza() {
        return pizzas.stream()
                .max(Comparator.comparing(Pizza::getCalories))
                .orElseThrow(NoSuchElementException::new);
    }

    public Pizza findLowestCaloriesPizza() {
        return pizzas.stream()
                .min(Comparator.comparing(Pizza::getCalories))
                .orElseThrow(NoSuchElementException::new);
    }
}
