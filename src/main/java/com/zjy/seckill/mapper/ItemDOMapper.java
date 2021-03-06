package com.zjy.seckill.mapper;

import com.zjy.seckill.dataobject.ItemDO;
import com.zjy.seckill.dataobject.UserDO;
import com.zjy.seckill.service.model.UserModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemDOMapper {


    int increaseSales(@Param("id") Integer id, @Param("amount") Integer amount);

    List<ItemDO> listItem();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Dec 08 18:13:28 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Dec 08 18:13:28 CST 2020
     */
    int insert(ItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Dec 08 18:13:28 CST 2020
     */
    int insertSelective(ItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Dec 08 18:13:28 CST 2020
     */
    ItemDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Dec 08 18:13:28 CST 2020
     */
    int updateByPrimaryKeySelective(ItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Dec 08 18:13:28 CST 2020
     */
    int updateByPrimaryKey(ItemDO record);
}