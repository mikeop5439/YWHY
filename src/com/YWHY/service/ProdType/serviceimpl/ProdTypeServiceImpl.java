package com.YWHY.service.ProdType.serviceimpl;

import com.YWHY.bean.ProdType;
import com.YWHY.mapper.ProdType.ProdTypeMapper;
import com.YWHY.service.ProdType.service.ProdTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdTypeServiceImpl implements ProdTypeService {
    @Autowired
    private ProdTypeMapper prodTypeMapper;
    @Override
    public int deleteByPrimaryKey(Integer prodTypeId) {
        prodTypeMapper.deleteByPrimaryKey(prodTypeId);
        return 0;
    }

    @Override
    public int insert(ProdType record) {
        prodTypeMapper.insert(record);
        return 0;
    }

    @Override
    public int insertSelective(ProdType record) {
        prodTypeMapper.insertSelective(record);
        return 0;
    }

    @Override
    public ProdType selectByPrimaryKey(Integer prodTypeId) {
        return prodTypeMapper.selectByPrimaryKey(prodTypeId);
    }

    @Override
    public int updateByPrimaryKeySelective(ProdType record) {
        prodTypeMapper.updateByPrimaryKeySelective(record);
        return 0;
    }

    @Override
    public int updateByPrimaryKey(ProdType record) {
        prodTypeMapper.updateByPrimaryKey(record);
        return 0;
    }

    @Override
    public List<ProdType> selectOfAll() {
        return prodTypeMapper.selectOfAll();
    }
}
