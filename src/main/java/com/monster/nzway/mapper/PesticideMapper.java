package com.monster.nzway.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.monster.nzway.domain.Pesticide;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * @author monster
 */

@Component
public interface PesticideMapper extends BaseMapper<Pesticide> {

   ArrayList<Pesticide> selectAll();

   void insertPesticide(Pesticide pesticide);

}
