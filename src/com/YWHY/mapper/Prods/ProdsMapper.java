package com.YWHY.mapper.Prods;

import com.YWHY.bean.Prods;
import com.YWHY.bean.more.ProdsNameAndAccount;

public interface ProdsMapper {
    int deleteByPrimaryKey(Integer prodsId);

    int insert(Prods record);

    int insertSelective(Prods record);

    Prods selectByPrimaryKey(Integer prodsId);

    int updateByPrimaryKeySelective(Prods record);

    int updateByPrimaryKey(Prods record);

    ProdsNameAndAccount selectProdsNameAndAccount(Integer orderId);
}