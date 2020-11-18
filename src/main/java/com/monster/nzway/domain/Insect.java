package com.monster.nzway.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author monster
 */
@Data
public class Insect {

    @TableId(type = IdType.AUTO)
    private Long id;
    private Avatar avatar;
    private String name;
    private String nickname;
    private String description;
}
