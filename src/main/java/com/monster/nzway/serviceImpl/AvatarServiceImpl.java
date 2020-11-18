package com.monster.nzway.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.monster.nzway.domain.Avatar;
import com.monster.nzway.mapper.AvatarMapper;
import com.monster.nzway.service.AvatarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("AvatarService")
public class AvatarServiceImpl extends ServiceImpl<AvatarMapper, Avatar> implements AvatarService {
    @Autowired
    AvatarMapper avatarMapper;

    public ArrayList<Avatar> all(){
      return   avatarMapper.all();
    };
}
