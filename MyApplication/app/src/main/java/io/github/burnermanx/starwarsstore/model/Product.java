package io.github.burnermanx.starwarsstore.model;

/**
 * Created by Burner on 29/05/2017.
 */

public class Product {
    private String title;
    private long price;
    private String zipcode;
    private String seller;
    private String thumbnailHd;
    private String date;

    public String getTitle() {
        return title;
    }

    public long getPrice() {
        return price;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getSeller() {
        return seller;
    }

    public String getThumbnailHd() {
        return thumbnailHd;
    }

    public String getDate() {
        return date;
    }
}
