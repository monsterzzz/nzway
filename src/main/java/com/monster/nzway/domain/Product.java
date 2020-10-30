package com.monster.nzway.domain;

import lombok.Data;

import java.util.Map;

/**
 * @author monster
 */

@Data
public class Product {
    private Integer id;
    private String name;
    private String avatar;
    private Double price;
    private String description;
    private String type;
    private String brand;
    private String savePlace;
    private String standards;
    private String company;
    private String distributor;
}
