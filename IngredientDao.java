import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;


public class IngredientDao implements Dao<Ingredient> {
    private Connection connection;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;

    public IngredientDao(){

    }
    
    @Override
    public Ingredient get(UUID id) throws SQLException {
        this.connection = Connection.getInstance().getConnection();

        String sql = "SELECT id, name, price FROM ingredient WHERE id=?";

        preparedStatement = connection.getConnection(sql);

        resultSet = preparedStatement.executeQuery();

        resultSet.next();
        Ingredient ingredient = new Ingredient(resultSet.getString("name"), resultSet.getDouble("price"));
       

        resultSet.close();
        preparedStatement.close();

        return Optional.of(ingredient).orElseThrow(SQLException::new);
    }

    @Override
    public Set<Ingredient> getAll() throws SQLException {
        this.connection = Connection.getInstance().getConnection();

        String sql = "SELECT name, price FROM ingredient";

        preparedStatement = connection.getConnection(sql);
        resultSet = preparedStatement.executeQuery();
        
        Set<Ingredient> ingredients = new HashSet<Ingredient>();
        Ingredient ingredient = null;

        while (resultSet.next()){
            ingredient = new Ingredient(resultSet.getString("name"), resultSet.getDouble("price"));
            ingredients.add(ingredient);
        }

        resultSet.close();
        preparedStatement.close();

        return Optional.of(ingredients).orElseThrow(SQLException::new);
    }
    }

    @Override
    public void save(Ingredient ingredient) {
        try {
            this.connection = Connection.getInstance().getConnection();

            String sql = "INSERT INTO ingredient(id, name, price) VALUES(?,?,?)";

            preparedStatement = connection.getConnection(sql);
			preparedStatement.setString(2, ingredient.getName());
			preparedStatement.setDouble(3, ingredient.getPrice());
			preparedStatement.executeUpdate();
            preparedStatement.close();

			System.out.println("Ingredient added!");
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                if(this.connection != null){
                    this.connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
    }

    @Override
    public void update(Ingredient ingredient, String[] params) {
        try {
            this.connection = Connection.getInstance().getConnection();
            
            String sql = "UPDATE ingredient SET name=?, price=? WHERE id=?";

            preparedStatement = connection.getConnection(sql);
			preparedStatement.setString(1, ingredient.getName());
			preparedStatement.setDouble(2, ingredient.getPrice());
			preparedStatement.executeUpdate();
            preparedStatement.close();

			System.out.println("Ingredient updated!");
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                if(this.connection != null){
                    this.connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
    }

    @Override
    public void delete(Ingredient ingredient) {
        
        try {
            this.connection = Connection.getInstance().getConnection();

            String sql = "DELETE FROM ingredient WHERE id=?";
           
            preparedStatement = connection.getConnection(sql);
			preparedStatement.executeUpdate();
            preparedStatement.close();

			System.out.println("Ingredient deleted!");
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                if(this.connection != null){
                    this.connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
    }
    
   
}
