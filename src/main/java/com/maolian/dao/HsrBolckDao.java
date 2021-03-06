package com.maolian.dao;

import com.maolian.entity.HsrBlock;
import com.maolian.entity.HsrBlockExample;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


public interface HsrBolckDao {

    public List<HsrBlock> selectByExample(HsrBlockExample param);

    public HsrBlock selectByPrimaryKey(String key);

    public List<HsrBlock> findTxListByParam(Map<String,Object> paramMap);

    public Integer findTxListByParamByCount(Map<String,Object> paramMap);


    public Map<String,Object> findTxById(String hashStr);


    public List<Map<String,Object>> findTxOut(String idStr);

    public List<Map<String,Object>> findTxIn(String idStr);
}
