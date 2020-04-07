package com.wujun.demostart.mapper;

import com.wujun.demostart.entity.Detail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DetailMapper {
    /**
     * 查询所有的明细信息
     * @return 返回一个明细集合
     */
    List<Detail> SelectAllDetails();

    /**
     *
     * 根据trans_id查
     * @return
     * @param transId
     */
    Detail selectDetailByTransId(Integer transId);

    /**
     * 按照条件查询明细表
     * @param detail
     * @return
     */
    List<Detail> selectDetailFuzzySerch(Detail detail);

    /**
     * 插入一条明细
     * @param detail
     * @return
     */
    int insertDetail(Detail detail);

    /**
     * 根据id删除
     * @param transId
     * @return
     */
    int deleteDetailByTransId(Integer transId);

    /**
     * 通过id更新明细
     * @param detail
     * @return
     */
    int updateDetailByTransId(Detail detail);
}
