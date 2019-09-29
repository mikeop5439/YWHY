package com.YWHY.mapper.ProdType;

import com.YWHY.bean.ProdType;

import java.util.List;

public interface ProdTypeMapper {
    int deleteByPrimaryKey(Integer prodTypeId);

    int insert(ProdType record);

    int insertSelective(ProdType record);

    ProdType selectByPrimaryKey(Integer prodTypeId);

    int updateByPrimaryKeySelective(ProdType record);

    int updateByPrimaryKey(ProdType record);

    List<ProdType> selectOfAll();
}