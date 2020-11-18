package com.monster.nzway.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author monster
 */

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
public class Pesticide extends Product {
    private Number number;
    private String level;
    private String content;
    private ArrayList<Insect> insects;
}
