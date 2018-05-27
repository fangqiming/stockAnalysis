package com.i000.stock.user.api.service;

import com.i000.stock.user.dao.model.Financial;
import com.i000.stock.user.dao.model.FinancialYear;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public interface YearByYear {

    /**
     * 计算出财务指标的增长率
     *
     * @param financial
     * @return
     */
    List<FinancialYear> getFinancialYear(List<Financial> financial);

    default BigDecimal getYearGross(BigDecimal befor, BigDecimal after) {
        if (Objects.nonNull(befor) && Objects.nonNull(after)) {
            try{
                return (after.subtract(befor)).divide(befor, 4, BigDecimal.ROUND_UP);
            }catch (ArithmeticException e){
                return null;
            }
        }
        return null;
    }
}
