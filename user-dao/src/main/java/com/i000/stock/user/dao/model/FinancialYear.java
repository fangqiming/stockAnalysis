package com.i000.stock.user.dao.model;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("financialyear")
public class FinancialYear {
    private String code;
    private LocalDate stat_date;
    /**
     * 在算出一个自由现金流  一个负债率
     * 销售毛利率  可以计算增长率
     */
    private BigDecimal gross_profit_margin;
    /**
     * 营业收入  可以计算增长率
     */
    private BigDecimal operating_revenue;
    private BigDecimal roe;
    /**
     * 总负债  可以计算增长率
     */
    private BigDecimal total_liability;
    /**
     * 总资产  可以计算增长率
     */
    private BigDecimal total_assets;
    private BigDecimal pe_ratio;
    private BigDecimal pe_ratio_lyr;
    /**
     * 净利润 可以计算增长率
     */
    private BigDecimal net_profit;

    /**
     * 初期现金及现金等价物
     */
    private BigDecimal cash_equivalents_at_beginning;
    /**
     * 末期现金及现金等价物
     */
    private BigDecimal cash_and_equivalents_at_end;
    /**
     * 固定资产
     */
    private BigDecimal fixed_assets;

    /**
     * 自由现金流
     */
    private BigDecimal free_cash;

    /**
     * 负债率
     */
    private BigDecimal liability_rate;
}
