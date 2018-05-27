package com.i000.stock.user.service.impl;

import com.i000.stock.user.dao.mapper.FinancialMapper;
import com.i000.stock.user.dao.model.Financial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class FinancialServiceImpl {

    @Autowired
    private FinancialMapper financialMapper;

    public List<Financial> find(String code) {
        return financialMapper.find(code);
    }
}
