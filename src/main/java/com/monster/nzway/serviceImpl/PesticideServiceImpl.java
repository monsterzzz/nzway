package com.monster.nzway.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.monster.nzway.domain.Pesticide;
import com.monster.nzway.domain.Product;
import com.monster.nzway.mapper.*;
import com.monster.nzway.service.AvatarService;
import com.monster.nzway.service.PesticideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author monster
 */
@Service
public class PesticideServiceImpl extends ServiceImpl<PesticideMapper, Pesticide> implements PesticideService {

    @Autowired
    AvatarMapper avatarMapper;
    @Autowired
    CompanyMapper companyMapper;
    @Autowired
    DistributorMapper distributorMapper;
    @Autowired
    NumberMapper numberMapper;
    @Autowired
    ProductMapper productMapper;
    @Autowired
    PesticideMapper pesticideMapper;
    @Autowired
    InsectMapper insectMapper;

    public void insertPesticide(Pesticide pesticide){
        avatarMapper.insert(pesticide.getAvatar());
        companyMapper.insert(pesticide.getCompany());
        distributorMapper.insert(pesticide.getDistributor());
        numberMapper.insert(pesticide.getNumber());
        productMapper.insertProduct(pesticide);
        for (int i = 0; i < pesticide.getInsects().size(); i++){
            insectMapper.insertInsect(pesticide.getInsects().get(i));
            insectMapper.insertCure(pesticide.getId(),pesticide.getInsects().get(i).getId());
        }
        pesticideMapper.insertPesticide(pesticide);
    };

    public ArrayList<Pesticide> selectAll(){
      return pesticideMapper.selectAll();
    };


}
