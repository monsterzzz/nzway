package com.monster.nzway.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.monster.nzway.domain.Avatar;

import java.util.ArrayList;

public interface AvatarService extends IService<Avatar> {
    ArrayList<Avatar> all();
}
