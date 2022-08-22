package rs.ac.singidunum.icr.persistence.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "product_rating")
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "product_id")
    @JsonIgnoreProperties("product_rating")
    private Product product;

    @Column(name = "one_star")
    private int oneStar;

    @Column(name = "two_stars")
    private int twoStars;

    @Column(name = "three_stars")
    private int threeStars;

    @Column(name = "four_stars")
    private int fourStars;

    @Column(name = "five_stars")
    private int fiveStars;


    public Rating() {
    }

    public Rating(Product product, int oneStar, int twoStars, int threeStars, int fourStars, int fiveStars) {
        this.setProduct(product);
        this.setOneStar(oneStar);
        this.setTwoStars(twoStars);
        this.setThreeStars(threeStars);
        this.setFourStars(fourStars);
        this.setFiveStars(fiveStars);
    }

    public Rating(int id, Product product, int oneStar, int twoStars, int threeStars, int fourStars, int fiveStars) {
        this.setId(id);
        this.setProduct(product);
        this.setOneStar(oneStar);
        this.setTwoStars(twoStars);
        this.setThreeStars(threeStars);
        this.setFourStars(fourStars);
        this.setFiveStars(fiveStars);
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getOneStar() {
        return oneStar;
    }

    public void setOneStar(int oneStar) {
        this.oneStar = oneStar;
    }

    public int getTwoStars() {
        return twoStars;
    }

    public void setTwoStars(int twoStars) {
        this.twoStars = twoStars;
    }

    public int getThreeStars() {
        return threeStars;
    }

    public void setThreeStars(int threeStars) {
        this.threeStars = threeStars;
    }

    public int getFourStars() {
        return fourStars;
    }

    public void setFourStars(int fourStars) {
        this.fourStars = fourStars;
    }

    public int getFiveStars() {
        return fiveStars;
    }

    public void setFiveStars(int fiveStars) {
        this.fiveStars = fiveStars;
    }
}
