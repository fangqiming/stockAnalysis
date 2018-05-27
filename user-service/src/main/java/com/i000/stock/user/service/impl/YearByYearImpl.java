package com.i000.stock.user.service.impl;

import com.i000.stock.user.api.service.YearByYear;
import com.i000.stock.user.dao.model.Financial;
import com.i000.stock.user.dao.model.FinancialYear;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class YearByYearImpl implements YearByYear {

    @Override
    public List<FinancialYear> getFinancialYear(List<Financial> financial) {
        List<FinancialYear> result = new ArrayList<>(financial.size());
        if (!CollectionUtils.isEmpty(financial)) {
            //排序
            financial.sort(Comparator.comparing(Financial::getStat_date));
            for (int i = 0; i < financial.size() - 1; i++) {
                Financial befor = financial.get(i);
                Financial after = financial.get(i + 1);
                FinancialYear financialYear = FinancialYear.builder()
                        .code(befor.getCode())
                        .stat_date(after.getStat_date())
                        .gross_profit_margin(getYearGross(befor.getGross_profit_margin(), after.getGross_profit_margin()))
                        .operating_revenue(getYearGross(befor.getOperating_revenue(), after.getOperating_revenue()))
                        .roe(getYearGross(befor.getRoe(), after.getRoe()))
                        .total_liability(getYearGross(befor.getTotal_liability(), after.getTotal_liability()))
                        .total_assets(getYearGross(befor.getTotal_assets(), after.getTotal_assets()))
                        .pe_ratio(getYearGross(befor.getPe_ratio(), after.getPe_ratio()))
                        .pe_ratio_lyr(getYearGross(befor.getPe_ratio_lyr(), after.getPe_ratio_lyr()))
                        .net_profit(getYearGross(befor.getNet_profit(), after.getNet_profit()))
                        .cash_equivalents_at_beginning(getYearGross(befor.getCash_equivalents_at_beginning(), after.getCash_equivalents_at_beginning()))
                        .cash_and_equivalents_at_end(getYearGross(befor.getCash_and_equivalents_at_end(), after.getCash_and_equivalents_at_end()))
                        .fixed_assets(getYearGross(befor.getFixed_assets(), after.getFixed_assets()))
                        .free_cash(getYearGross(befor.getFree_cash(), after.getFree_cash()))
                        .liability_rate(getYearGross(befor.getLiability_rate(), after.getLiability_rate())).build();
                result.add(financialYear);
            }
        }
        return result;
    }
}
