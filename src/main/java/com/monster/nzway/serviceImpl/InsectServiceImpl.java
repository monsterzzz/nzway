package com.monster.nzway.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.monster.nzway.domain.Insect;
import com.monster.nzway.mapper.InsectMapper;
import com.monster.nzway.service.InsectService;

import java.util.ArrayList;

public class InsectServiceImpl extends ServiceImpl<InsectMapper, Insect> implements InsectService {

    @Override
    public ArrayList<Insect> selectByPesticideId(Long id) {
        return null;
    }

    @Override
    public void insertInsect(Insect insect) {

    }


}
