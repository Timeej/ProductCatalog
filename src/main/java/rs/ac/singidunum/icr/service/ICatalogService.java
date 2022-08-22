package rs.ac.singidunum.icr.service;

import rs.ac.singidunum.icr.persistence.model.ItemSearchResponse;

public interface ICatalogService {

    ItemSearchResponse searchProductsAndCategories(String name);
}
