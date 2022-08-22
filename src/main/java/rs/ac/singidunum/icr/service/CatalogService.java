package rs.ac.singidunum.icr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.ac.singidunum.icr.persistence.dao.CategoryRepository;
import rs.ac.singidunum.icr.persistence.dao.ProductRepository;
import rs.ac.singidunum.icr.persistence.model.Category;
import rs.ac.singidunum.icr.persistence.model.ItemSearchResponse;
import rs.ac.singidunum.icr.persistence.model.Product;

import java.util.List;

@Service
public class CatalogService implements ICatalogService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    public ItemSearchResponse searchProductsAndCategories(String name) {
        List<Product> products = productRepository.findByNameContaining(name);
        List<Category> categories = categoryRepository.findByNameContaining(name);
        ItemSearchResponse isr = new ItemSearchResponse(products, categories);
        return isr;
    }
}
