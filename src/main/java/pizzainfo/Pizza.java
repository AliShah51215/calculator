package pizzainfo;

import java.util.List;

public class Pizza {
    private final String name;
    private final int calories;
    private final List<Ingredients> ingredients;
    private final boolean isVegetarian;

    public Pizza(String name, boolean isVegetarian, List<Ingredients> ingredients, int calories) {
        this.name = name;
        this.isVegetarian = isVegetarian;
        this.ingredients = ingredients;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "Pizza: " + name + ", Vegetarian: " + isVegetarian + ", ingredients: " + ingredients + ", calories=" + calories;
    }
}