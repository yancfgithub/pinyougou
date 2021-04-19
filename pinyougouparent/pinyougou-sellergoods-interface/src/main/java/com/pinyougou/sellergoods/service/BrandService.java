package com.pinyougou.sellergoods.service;

/**
 * @author yan
 * @create 2021 - 04 - 18 23:01
 */

import com.pinyougou.pojo.TbBrand;
import com.pinyougou.pojo.entity.PageResult;

import java.util.List;

/**
 * 品牌接口
 */

public interface BrandService {

    //查询所有的品牌
    public List<TbBrand> findAll();

    //查询分页内容
    public PageResult findPage(int pageNum,int pageSize);

}
