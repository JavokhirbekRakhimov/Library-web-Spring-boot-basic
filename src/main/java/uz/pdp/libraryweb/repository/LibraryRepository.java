package uz.pdp.libraryweb.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.libraryweb.entity.Library;


import java.util.Optional;

public interface LibraryRepository
        extends JpaRepository<Library, Integer> {
    Optional<Library> findAllByName(String name);


}
