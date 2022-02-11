package uz.pdp.libraryweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.libraryweb.entity.Address;

public interface AddressRepository
        extends JpaRepository<Address, Integer> {

}
