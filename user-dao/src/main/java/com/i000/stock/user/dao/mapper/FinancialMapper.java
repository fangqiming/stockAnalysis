package com.i000.stock.user.dao.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.i000.stock.user.dao.model.Financial;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FinancialMapper extends BaseMapper<Financial> {

    /**
     * 根据股票代码查询股票的财务数据
     *
     * @param code
     * @return
     */
    @Select("select * from financial where `code`=#{code}")
    List<Financial> find(@Param("code") String code);
}
