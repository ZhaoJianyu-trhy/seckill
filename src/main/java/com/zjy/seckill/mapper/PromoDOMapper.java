package com.zjy.seckill.mapper;

import com.zjy.seckill.dataobject.PromoDO;
import org.apache.ibatis.annotations.Param;

public interface PromoDOMapper {

    PromoDO selectByItemId(@Param("itemId") Integer itemId);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Thu Dec 10 14:41:59 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Thu Dec 10 14:41:59 CST 2020
     */
    int insert(PromoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Thu Dec 10 14:41:59 CST 2020
     */
    int insertSelective(PromoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Thu Dec 10 14:41:59 CST 2020
     */
    PromoDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Thu Dec 10 14:41:59 CST 2020
     */
    int updateByPrimaryKeySelective(PromoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Thu Dec 10 14:41:59 CST 2020
     */
    int updateByPrimaryKey(PromoDO record);
}