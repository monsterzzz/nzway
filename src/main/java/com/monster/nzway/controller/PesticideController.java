package com.monster.nzway.controller;

import com.monster.nzway.domain.*;
import com.monster.nzway.domain.Number;
import com.monster.nzway.mapper.PesticideMapper;
import com.monster.nzway.service.AvatarService;
import com.monster.nzway.service.PesticideService;
import com.monster.nzway.serviceImpl.PesticideServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/**
 * @author monster
 */

@Controller

public class PesticideController {

    @Autowired
    PesticideService pesticideService;
    @Autowired
    AvatarService avatarService;


    @RequestMapping("/")
    @ResponseBody
    public ArrayList<Pesticide> index(){

        Pesticide pesticide = new Pesticide();

        Company company = new Company();
        company.setAddress("hello company address");
        company.setName("qb company");
        company.setPhone("1234567890");
        Distributor distributor = new Distributor();
        distributor.setAddress("hello distributor address");
        distributor.setName("distributor name");
        distributor.setPhone("1234567890");
        Avatar avatar = new Avatar();
        avatar.setUrl("https://www.baidu.com");
        Number number = new Number();
        number.setProductionLicense("pl number");
        number.setStandard("sd number");
        number.setRegister("rg number");
        ArrayList<Insect> insects = new ArrayList<Insect>();
        for(int i = 0; i < 3; i++){
            Insect insect = new Insect();
            insect.setAvatar(avatar);
            insect.setName("臭屁虫");
            insect.setNickname("臭屁虫");
            insect.setDescription("insect description");
            insects.add(insect);
        }


        pesticide.setStandard("300ml/瓶");
        pesticide.setLevel("中毒");
        pesticide.setContent("hello world");
        pesticide.setBrand("虎威");
        pesticide.setName("高效氯氰菊酯");
        pesticide.setPrice(60.0);
        pesticide.setDescription("hello description");
        pesticide.setInsects(insects);
        pesticide.setCompany(company);
        pesticide.setDistributor(distributor);
        pesticide.setAvatar(avatar);
        pesticide.setNumber(number);

        pesticideService.insertPesticide(pesticide);

        //        System.out.println(result.get(0));
//        System.out.println(result.get(0).getId());
//        System.out.println(result);
        //return "index";
        return pesticideService.selectAll();
    }

}
