package com.monster.nzway.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.monster.nzway.domain.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;


@Component
public interface ProductMapper extends BaseMapper<Product> {

   void insertProduct(Product product);

}
