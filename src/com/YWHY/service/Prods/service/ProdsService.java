package com.YWHY.service.Prods.service;

import com.YWHY.bean.Prods;

public interface ProdsService {
    int deleteByPrimaryKey(Integer prodsId);

    int insert(Prods record);

    int insertSelective(Prods record);

    Prods selectByPrimaryKey(Integer prodsId);

    int updateByPrimaryKeySelective(Prods record);

    int updateByPrimaryKey(Prods record);
}
