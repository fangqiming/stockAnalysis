package com.i000.stock.user.web.controller.choose;

import com.i000.stock.user.core.result.Results;
import com.i000.stock.user.core.result.base.ResultEntity;
import com.i000.stock.user.dao.model.Financial;
import com.i000.stock.user.dao.model.FinancialYear;
import com.i000.stock.user.dao.model.Industry;
import com.i000.stock.user.service.impl.FinancialServiceImpl;
import com.i000.stock.user.service.impl.FinancialYearImpl;
import com.i000.stock.user.service.impl.IndustryServiceImpl;
import com.i000.stock.user.service.impl.YearByYearImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/financial")
@CrossOrigin(origins = "*", maxAge = 3600)
public class FinalcialController {

    @Autowired
    private IndustryServiceImpl industryService;

    @Autowired
    private FinancialServiceImpl financialService;

    @Autowired
    private FinancialYearImpl financialYear;

    @Autowired
    private YearByYearImpl yearByYear;

    @GetMapping("/year_gross")
    public ResultEntity saveYearGross() {
        List<Industry> industries = industryService.find();
        for (Industry industry : industries) {
            List<Financial> financials = financialService.find(industry.getCode());
            List<FinancialYear> financialYears = yearByYear.getFinancialYear(financials);
            financialYear.save(financialYears);
        }
        return Results.newNormalResultEntity("st", "success");
    }
}
