package com.i000.stock.user.dao.model;

import com.baomidou.mybatisplus.annotations.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

/**
 * @Author:qmfang
 * @Description:
 * @Date:Created in 15:10 2018/4/26
 * @Modified By:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Hold {

    @TableId
    private Long id;
    private String name;
    private LocalDate oldDate;
    private BigDecimal oldPrice;
    private BigDecimal oldRank;
    private LocalDate newDate;
    private BigDecimal newPrice;
    private BigDecimal newRank;
    private Integer holdDay;
    private BigDecimal gain;
    private String type;
    //持股数量
    private Integer amount;
    private String action;


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Hold) {
            Hold hold = (Hold) obj;
            return this.name.equals(hold.getName())
                    && this.oldDate.equals(hold.getOldDate())
                    && this.type.equals(hold.getType());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, oldDate, type);
    }
}
