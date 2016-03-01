/**
 * Object]
 */

package com.microsoft.azure.management.website.models;


/**
 * The plan object in an ARM, represents a marketplace plan.
 */
public class ArmPlan {
    /**
     * The name.
     */
    private String name;

    /**
     * The publisher.
     */
    private String publisher;

    /**
     * The product.
     */
    private String product;

    /**
     * The promotion code.
     */
    private String promotionCode;

    /**
     * Version of product.
     */
    private String version;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the publisher value.
     *
     * @return the publisher value
     */
    public String getPublisher() {
        return this.publisher;
    }

    /**
     * Set the publisher value.
     *
     * @param publisher the publisher value to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * Get the product value.
     *
     * @return the product value
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * Set the product value.
     *
     * @param product the product value to set
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * Get the promotionCode value.
     *
     * @return the promotionCode value
     */
    public String getPromotionCode() {
        return this.promotionCode;
    }

    /**
     * Set the promotionCode value.
     *
     * @param promotionCode the promotionCode value to set
     */
    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
    }

    /**
     * Get the version value.
     *
     * @return the version value
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version value.
     *
     * @param version the version value to set
     */
    public void setVersion(String version) {
        this.version = version;
    }

}
