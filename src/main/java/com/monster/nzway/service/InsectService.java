package com.monster.nzway.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.monster.nzway.domain.Insect;

import java.util.ArrayList;

public interface InsectService extends IService<Insect> {

    ArrayList<Insect> selectByPesticideId(Long id);

    void insertInsect(Insect insect);


}
