package com.monster.nzway.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author monster
 */

@Data
public class Distributor {

    private Long id;

    private String name;

    private String address;

    private String phone;
}
