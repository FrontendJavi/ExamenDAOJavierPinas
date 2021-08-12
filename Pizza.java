import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Pizza extends Entity {
    public String name;
    public double price;
    public String url;
    private final Set<Ingredient> ingredients = new HashSet<Ingredient>();
    private final Set<Comment> comments = new HashSet<Comment>();

    public Pizza(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String newUrl) {
        this.url = newUrl;
    }

    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }

    public void deleteIngrediente(Ingredient ingredient){
        ingredients.remove(ingredient);
    }

    public Set<Ingredient>getIngredientes(){
        return this.ingredients;
    }

    public Double getPrice(){
        for(Ingredient ing: ingredients){
            this.price += ing.getPrice();
        }
        this.price = 1.2*this.price;
        return this.price;
    }

    public void setComment(Comment comment){
        comments.add(comment);
    }

    public static void main(String[] args) {
        List<Pizza> pizzas = new ArrayList<Pizza>();
        pizzas.add(new Pizza("Margarita", "assks.jpg"));
        pizzas.add(new Pizza("Hawaiiana", "a8aja.jpg"));
        pizzas.add(new Pizza("Siciliana", "arksw.jpg"));
        pizzas.add(new Pizza("Margarita", "a9bns.jpg"));
        System.out.println(pizzas);
    }

}