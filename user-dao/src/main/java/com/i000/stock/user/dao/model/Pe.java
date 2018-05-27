package com.i000.stock.user.dao.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pe {
    private BigDecimal pe_ratio;
    private String code;
    private BigDecimal pe_ratio_lyr;
}
