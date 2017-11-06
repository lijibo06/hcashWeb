package com.maolian.service;

import com.maolian.dao.HsrBolckDao;
import com.maolian.entity.HsrBlock;
import com.maolian.entity.HsrBlockExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class HsrBlockServiceImpl implements HsrBlockService {
    @Resource
    private HsrBolckDao hsrBolckDao;

    public List<HsrBlock> selectByExample(HsrBlockExample param) {
        return this.hsrBolckDao.selectByExample(param);
    }


    public HsrBlock selectByPrimaryKey(String key) {
        return this.hsrBolckDao.selectByPrimaryKey(key);
    }

    public List<HsrBlock> findTxListByParam(Map<String, Object> paramMap) {
        return hsrBolckDao.findTxListByParam(paramMap);
    }


    public Integer findTxListByParamByCount(Map<String, Object> paramMap) {
        return hsrBolckDao.findTxListByParamByCount(paramMap);
    }


    public Map<String, Object> findTxById(String hashStr) {
        return hsrBolckDao.findTxById(hashStr);
    }


    public List<Map<String, Object>> findTxOut(String idStr) {
        return hsrBolckDao.findTxOut(idStr);
    }


    public List<Map<String, Object>> findTxIn(String idStr) {
        return hsrBolckDao.findTxIn(idStr);
    }
}
