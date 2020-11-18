package com.monster.nzway.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.monster.nzway.domain.Pesticide;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author monster
 */


public interface PesticideService extends IService<Pesticide> {

    void insertPesticide(Pesticide pesticide);

    ArrayList<Pesticide> selectAll();

}
