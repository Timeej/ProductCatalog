package rs.ac.singidunum.icr.persistence.model;

import java.util.List;

public class ItemSearchResponse {

    private List<Product> productListSearch;
    private List<Category> categoryListSearch;

    public ItemSearchResponse() {}

    public ItemSearchResponse(List<Product> productListSearch, List<Category> categoryListSearch) {
        this.setProductListSearch(productListSearch);
        this.setCategoryListSearch(categoryListSearch);
    }

    public List<Product> getProductListSearch() {
        return productListSearch;
    }

    public void setProductListSearch(List<Product> productListSearch) {
        this.productListSearch = productListSearch;
    }

    public List<Category> getCategoryListSearch() {
        return categoryListSearch;
    }

    public void setCategoryListSearch(List<Category> categoryListSearch) {
        this.categoryListSearch = categoryListSearch;
    }

    @Override
    public String toString() {
        return "SearchResult{" +
                "productListSearch=" + productListSearch +
                ", categoryListSearch=" + categoryListSearch +
                '}';
    }
}
