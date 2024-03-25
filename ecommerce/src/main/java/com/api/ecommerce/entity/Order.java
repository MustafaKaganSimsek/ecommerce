package com.api.ecommerce.entity;

import java.util.Date;
import java.util.UUID;

public class Order {

    private UUID id;

    private Customer customer;

    private Payment payment;

    private Date shipDate;

    private Shipper shipper;
    
}
