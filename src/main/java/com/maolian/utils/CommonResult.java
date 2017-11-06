package com.maolian.utils;

import com.fasterxml.jackson.databind.util.JSONPObject;
import net.sf.json.JSONObject;

import java.util.List;
import java.util.Map;

public class CommonResult {
    private String returnStatus;

    private String returnMsg;

    private String returnData;


    public String getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(String returnStatus) {
        this.returnStatus = returnStatus;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public String getReturnData() {
        return returnData;
    }

    public void setReturnData(String returnData) {
        this.returnData = returnData;
    }

    public CommonResult(String returnStatus, String returnMsg, String returnData)
    {
        this.returnStatus=returnStatus;
        this.returnMsg=returnMsg;
        this.returnData=returnData;

    }

    public static String setPageResult(Integer total, List<Map<String,Object>> dataList,String returnMsg,String returnStatus)
    {
        JSONObject json=new JSONObject();
        json.put("total",total);
        if(dataList!=null&&dataList.size()>0) {
            json.put("dataList", dataList);
        }else
        {
            json.put("dataList","");
        }
        json.put("returnMsg",returnMsg);
        json.put("returnStatus",returnStatus);
        return json.toString();
    }

    public static String setResult( Map<String,Object> dataMap,String returnMsg,String returnStatus)
    {
        JSONObject json=new JSONObject();
        json.put("dataList",dataMap);
        json.put("returnMsg",returnMsg);
        json.put("returnStatus",returnStatus);
        return json.toString();
    }

    public static String setListResult( List<Map<String,Object>> dataList,String returnMsg,String returnStatus)
    {
        JSONObject json=new JSONObject();
        json.put("dataList",dataList);
        json.put("returnMsg",returnMsg);
        json.put("returnStatus",returnStatus);
        return json.toString();
    }

}
