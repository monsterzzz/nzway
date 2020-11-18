package com.monster.nzway.domain;

import lombok.Data;

import java.util.Map;

/**
 * @author monster
 */

@Data
public class Product {
    private Long id; // id
    private String name; // 名称
    private Avatar avatar; // 图像
    private Double price; // 价格
    private String description; // 描述
    private String brand; // 品牌
    private String standard; // 规格
    private Company company;  // 公司
    private Distributor distributor; // 经销商
}
