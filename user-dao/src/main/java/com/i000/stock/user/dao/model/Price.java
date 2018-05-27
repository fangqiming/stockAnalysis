package com.i000.stock.user.dao.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Author:qmfang
 * @Description:
 * @Date:Created in 13:59 2018/4/25
 * @Modified By:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Price {

    private String code;
    private String year;
    private BigDecimal low_q1;
    private BigDecimal low_q2;
    private BigDecimal low_q3;
    private BigDecimal low_q4;

    private BigDecimal avg_q1;
    private BigDecimal avg_q2;
    private BigDecimal avg_q3;
    private BigDecimal avg_q4;

    private BigDecimal high_q1;
    private BigDecimal high_q3;
    private BigDecimal high_q2;
    private BigDecimal high_q4;




//    @TableId
//    private Long id;
//
//    private String name;
//
//    private String code;
//
//    private BigDecimal open;
//
//    private BigDecimal close;
//
//    private BigDecimal volume;
//
//    private BigDecimal high;
//
//    private BigDecimal low;
//
//    private String date;
//
//    private BigDecimal buy;
//
//    private BigDecimal sell;
//
//    private Byte isOpen;
}
