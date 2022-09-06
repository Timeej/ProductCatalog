package rs.ac.singidunum.icr.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import rs.ac.singidunum.icr.persistence.model.Shop;

public interface ShopRepository extends JpaRepository<Shop, Integer> {

    Shop findShopByIdEquals(int id);
    Shop findShopByNameEquals(String name);
    Shop findShopByAddressEquals(String address);
}
