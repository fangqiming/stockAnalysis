package com.i000.stock.user.service.impl;

import com.i000.stock.user.dao.mapper.IndustryMapper;
import com.i000.stock.user.dao.model.Industry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IndustryServiceImpl {
    @Autowired
    private IndustryMapper industryMapper;

    public List<Industry> find() {
        return industryMapper.selectList(null);
    }
}
