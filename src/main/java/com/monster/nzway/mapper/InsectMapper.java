package com.monster.nzway.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.monster.nzway.domain.Insect;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public interface InsectMapper extends BaseMapper<Insect> {

    ArrayList<Insect> selectByPesticideId(Long id);

    void insertInsect(Insect insect);

    void insertCure(Long pid,Long insect_id);

}
