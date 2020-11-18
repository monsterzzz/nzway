package com.monster.nzway.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.monster.nzway.domain.Number;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
public interface NumberMapper extends BaseMapper<Number> {
}
