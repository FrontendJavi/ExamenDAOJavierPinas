import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;

public class CommentDao implements Dao<Comment> {

    private Connection connection;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;

    public CommentDAO(){
    }


    @Override
    public Comment get(UUID id) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public Set<Comment> getAll() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void save(Comment t) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void update(Comment t, String[] params) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void delete(Comment t) {
        // TODO Auto-generated method stub
        
    }

    

    
    
}
