package com.i000.stock.user.service.impl;

import com.i000.stock.user.dao.mapper.FinancialYearMapper;
import com.i000.stock.user.dao.model.FinancialYear;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FinancialYearImpl {

    @Autowired
    private FinancialYearMapper financialYearMapper;

    public void save(List<FinancialYear> financialYears) {
        for (FinancialYear financialYear : financialYears) {
            financialYearMapper.insert(financialYear);
        }
    }
}