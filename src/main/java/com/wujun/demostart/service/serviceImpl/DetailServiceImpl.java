package com.wujun.demostart.service.serviceImpl;

import com.wujun.demostart.entity.Detail;
import com.wujun.demostart.mapper.DetailMapper;
import com.wujun.demostart.service.DetailService;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author WuJun
 * @date 2019/12/1
 */
@Service
@Transactional
public class DetailServiceImpl implements DetailService {
    @Autowired
    DetailMapper detailMapper;

    @Override
    /**
     * 查询所有的明细信息
     * @return 返回一个明细集合
     */
    public List<Detail> SelectAllDetails() {
        return detailMapper.SelectAllDetails();
    }

    @Override
    public Detail selectDetailByTransId(Integer transId) {
        return detailMapper.selectDetailByTransId(transId);
    }

    @Override
    public List<Detail> selectDetailFuzzySerch(Detail detail) {
        return detailMapper.selectDetailFuzzySerch(detail);
    }

    @Override
    public boolean insertDetail(Detail detail) {
        int i = detailMapper.insertDetail(detail);
        if(i!=0){
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteDetailByTransId(Integer transId) {
        int i = detailMapper.deleteDetailByTransId(transId);
        if(i!=0){
            return true;
        }
        return false;
    }

    @Override
    public boolean updateDetailByTransId(Detail detail) {
        int i = detailMapper.updateDetailByTransId(detail);
        if(i!=0){
            return true;
        }
        return false;
    }


}
