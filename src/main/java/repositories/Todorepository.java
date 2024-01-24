package repositories;

import model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Todorepository extends JpaRepository<Todo, Integer> {
}
