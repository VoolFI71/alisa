package Interfaces;
import java.util.*;

public interface Repository<T, ID> {
    T save(T entity);
    List<T> saveAll(Collection<T> entities);
    Optional<T> findById(ID id);
    void deleteById(ID id);
    void deleteAll();
    long count();
    boolean existsById(ID id);
}
