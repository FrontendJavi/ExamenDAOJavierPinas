import java.util.UUID;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        IngredientDao ingredientDao = new IngredientDao();

        UUID idCheese = UUID.randomUUID();
        Ingredient cheese = new Ingredient("Queso de cabra", 0.9);
        cheese.generateID(idCheese);
        ingredientDao.save(cheese);
        
    }
}
