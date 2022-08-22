package rs.ac.singidunum.icr.web.controller;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rs.ac.singidunum.icr.persistence.dao.CategoryRepository;
import rs.ac.singidunum.icr.persistence.dao.ProductRepository;
import rs.ac.singidunum.icr.persistence.dao.RatingRepository;
import rs.ac.singidunum.icr.persistence.model.Category;
import rs.ac.singidunum.icr.persistence.model.ItemSearchResponse;
import rs.ac.singidunum.icr.persistence.model.Product;
import rs.ac.singidunum.icr.service.CatalogService;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProductCatalogController {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    RatingRepository ratingRepository;

    @Autowired
    CatalogService catalogService;


    public ProductCatalogController(ProductRepository productRepository, CategoryRepository categoryRepository, RatingRepository ratingRepository) {
        this.setProductRepository(productRepository);
        this.setCategoryRepository(categoryRepository);
        this.setRatingRepository(ratingRepository);
    }

    public ProductRepository getProductRepository() {
        return productRepository;
    }

    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public CategoryRepository getCategoryRepository() {
        return categoryRepository;
    }

    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public RatingRepository getRatingRepository() {
        return ratingRepository;
    }

    public void setRatingRepository(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id) {
        return productRepository.findByIdEquals(id);
    }

    @GetMapping("/products/{pathId}/path")
    public Product getProductByPathId(@PathVariable String pathId) {
        return productRepository.findByPathIdEquals(pathId);
    }

    @GetMapping("/products/{name}/name")
    public Product getProductByName(@PathVariable String name) {
        return productRepository.findByNameEquals(name);
    }

    @GetMapping("/products/{categoryId}/category_products")
    public List<Product> getProductsByCategoryId(@PathVariable int categoryId) {
        return productRepository.findByCategoryIdEquals(categoryId);
    }

    @GetMapping("/categories")
    public List<Category> getAllCategories() { return  categoryRepository.findAll(); }

    @GetMapping("/categories/{id}")
    public Category getCategoryById(@PathVariable int id) { return categoryRepository.findByIdEquals(id); }

    @GetMapping("/categories/{pathId}/path")
    public Category getCategoryByPathId(@PathVariable String pathId) {
        return  categoryRepository.findByPathIdEquals(pathId);
    }

    @GetMapping("/categories/{name}/name")
    public Category getCategoryByName(@PathVariable String name) {
        return categoryRepository.findByNameEquals(name);
    }

    @PostMapping("/catalog/search")
    public ItemSearchResponse searchProductsAndCategories(@RequestBody ObjectNode objectNode) {
        String name = objectNode.get("name").asText();
        return catalogService.searchProductsAndCategories(name);
    }
}
