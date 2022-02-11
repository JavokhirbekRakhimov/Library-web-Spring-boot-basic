package uz.pdp.libraryweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.libraryweb.entity.Category;

public interface CategoryRepository
        extends JpaRepository<Category, Integer> {
}
