package com.api.ecommerce.entity;

import java.util.Set;
import java.util.UUID;

public class Product {

    private UUID id;

    private String name;

    private Category category;

    private String picture;

    private String description;

    private Double unitPrice;

    private String detailsHtml;
    private String stock;

    private Integer weight;
    private Set<Order> orders;

    private Boolean active;

}
