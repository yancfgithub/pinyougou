package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.mapper.TbBrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author yan
 * @create 2021 - 04 - 18 23:09
 * 品牌服务层的实现
 */
@Service
public class BrandServiceImpl implements BrandService {


    @Autowired
    private TbBrandMapper brandMapper;

    //查询所有的品牌
    @Override
    public List<TbBrand> findAll() {
        return brandMapper.selectByExample(null);
    }
}
