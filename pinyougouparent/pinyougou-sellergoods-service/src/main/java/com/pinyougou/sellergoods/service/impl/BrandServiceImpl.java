package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pinyougou.mapper.TbBrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.pojo.entity.PageResult;
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

    //查询分页内容
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        Page<TbBrand> page = (Page<TbBrand>)brandMapper.selectByExample(null);
        return new PageResult(page.getTotal(),page.getResult());
    }
}
