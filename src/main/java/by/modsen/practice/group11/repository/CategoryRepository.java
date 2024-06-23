package by.modsen.practice.group11.repository;

import by.modsen.practice.group11.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoryRepository extends JpaRepository<Category, UUID> {
    void deleteById(UUID orderItemId);
}
