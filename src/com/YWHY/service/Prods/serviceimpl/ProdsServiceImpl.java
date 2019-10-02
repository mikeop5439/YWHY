package com.YWHY.service.Prods.serviceimpl;

import com.YWHY.bean.Prods;
import com.YWHY.bean.more.ProdsNameAndAccount;
import com.YWHY.mapper.Prods.ProdsMapper;
import com.YWHY.service.Prods.service.ProdsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdsServiceImpl implements ProdsService {
    @Autowired
    private ProdsMapper prodsMapper;
    @Override
    public int deleteByPrimaryKey(Integer prodsId) {
        prodsMapper.deleteByPrimaryKey(prodsId);
        return 0;
    }

    @Override
    public int insert(Prods record) {
        prodsMapper.insert(record);
        return 0;
    }

    @Override
    public int insertSelective(Prods record) {
        prodsMapper.insertSelective(record);
        return 0;
    }

    @Override
    public Prods selectByPrimaryKey(Integer prodsId) {
        return prodsMapper.selectByPrimaryKey(prodsId);
    }

    @Override
    public int updateByPrimaryKeySelective(Prods record) {
        prodsMapper.updateByPrimaryKeySelective(record);
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Prods record) {
        prodsMapper.updateByPrimaryKey(record);
        return 0;
    }

    @Override
    public ProdsNameAndAccount selectProdsNameAndAccount(Integer orderId) {
        return prodsMapper.selectProdsNameAndAccount(orderId);
    }
}
