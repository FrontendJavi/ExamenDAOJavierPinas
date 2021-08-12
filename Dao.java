import java.sql.SQLException;
import java.util.Set;
import java.util.UUID;

public interface Dao<T> {
    public T get(UUID id) throws SQLException;
    public Set<T> getAll() throws SQLException;

    
    void save(T t);
    
    void update(T t, String[] params);
    
    void delete(T t);
}
