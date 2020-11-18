package com.monster.nzway.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.monster.nzway.domain.Avatar;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public interface AvatarMapper extends BaseMapper<Avatar> {

    ArrayList<Avatar> all();
}
