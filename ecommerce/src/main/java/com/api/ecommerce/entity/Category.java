package com.api.ecommerce.entity;

import java.util.List;
import java.util.UUID;

public class Category {

    private UUID id;

    private String name;

    private String description;

    private List<Product> products;

    private String picture;

    private Boolean Active;
}
