package uz.pdp.libraryweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.libraryweb.entity.Book;
import uz.pdp.libraryweb.entity.Category;

import java.util.Collection;
import java.util.List;

public interface BookRepository
        extends JpaRepository<Book, Integer> {
    List<Book> findAllByLibrary_Id(Integer libraryId);
    List<Book> findAllByNameContainsAndActiveTrue(String name);
    List<Book> findAllByNameContainsAndLibraryIdAndActiveTrue(String name,Integer libraryId);
    List<Book> findAllByNameContainsAndLibraryIdAndCategoryListIn(String name, Integer library_id, Collection<List<Category>> categoryList);

//List<Book> findAllByNameContainsAndLibraryIdAndCategoryListContaining(String name, Integer library_id, List<Category> categoryList);


}
