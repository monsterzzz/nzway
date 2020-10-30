package com.monster.nzway.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author monster
 */

@EqualsAndHashCode(callSuper = false)
@Data
public class Pesticides extends Product {
    private Number number;
    private String level;
    private String content;
    private ArrayList<Insect> insects;
}
