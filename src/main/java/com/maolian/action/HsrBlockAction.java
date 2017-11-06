package com.maolian.action;

import com.maolian.entity.HsrBlock;
import com.maolian.entity.HsrBlockExample;
import com.maolian.service.HsrBlockService;
import com.maolian.utils.CommonResult;
import com.maolian.utils.Constants;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.apache.commons.io.filefilter.FalseFileFilter;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("block")
@Api(value = "/block", description = "HCashWeb的搜索功能")
public class HsrBlockAction {

    @Resource
    private HsrBlockService hsrBlockService;
    private Logger log= Logger.getLogger(HsrBlockAction.class);


    @RequestMapping(value = "findTxListByParam",method= RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    @ApiOperation(value = "根据搜索条件进行分页搜索", httpMethod = "POST", notes = "根据搜索条件进行分页搜索")
    public String findTxListByParam( @ApiParam(value="搜索字符串",required= false) @RequestParam("searchStr") String searchStr,
                                       @ApiParam(value="开始行",required=true) @RequestParam("startIndex") Integer startIndex,
                                       @ApiParam(value="每页条数",required=true) @RequestParam("pageSize") Integer pageSize)
    {
        try {

            Map<String,Object> paramMap=new HashMap();
            paramMap.put("searchStr",searchStr);
            //判断搜索条件属于哪种类型，根据类型来调用不同的接口
            Integer count=this.hsrBlockService.findTxListByParamByCount(paramMap);
            paramMap.put("startIndex",startIndex);
            paramMap.put("pageSize",pageSize);
           List txList=this.hsrBlockService.findTxListByParam(paramMap);
           System.out.println("------->"+CommonResult.setPageResult(count,txList,"success", Constants.RETURNMSG1));
            return CommonResult.setPageResult(count,txList,"success", Constants.RETURNMSG1);
        }catch(Exception e)
        {
            e.printStackTrace();
            return CommonResult.setPageResult(0,null,"error",Constants.RETURNMSG2);
        }

    }


    @RequestMapping(value = "findTxById",method= RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    @ApiOperation(value = "通过txId查询明细", httpMethod = "POST", notes = "通过txId获取明细")
    public String findTxById( @ApiParam(value="id值",required= true) @RequestParam("idStr") String idStr)
    {
        try {


            Map<String,Object> txMap=this.hsrBlockService.findTxById(idStr);
           return CommonResult.setResult(txMap,"success", Constants.RETURNMSG1);
        }catch(Exception e)
        {
            e.printStackTrace();
            return CommonResult.setResult(null,"success", Constants.RETURNMSG1);
        }

    }


    @RequestMapping(value = "findTxIn",method= RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    @ApiOperation(value = "通过txId获取输入信息", httpMethod = "POST", notes = "通过txId获取输入信息")
    public String findTxIn( @ApiParam(value="id值",required= true) @RequestParam("idStr") String idStr)
    {
        try {


            List<Map<String,Object>> inList=this.hsrBlockService.findTxIn(idStr);
            return CommonResult.setListResult(inList,"success", Constants.RETURNMSG1);
        }catch(Exception e)
        {
            e.printStackTrace();
            return CommonResult.setListResult(null,"success", Constants.RETURNMSG1);
        }

    }

    @RequestMapping(value = "findTxOut",method= RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    @ApiOperation(value = "通过txId获取收件人（输出）信息", httpMethod = "POST", notes = "通过txId获取收件人（输出）信息")
    public String findTxOut( @ApiParam(value="id值",required= true) @RequestParam("idStr") String idStr)
    {
        try {


           List<Map<String,Object>> outList=this.hsrBlockService.findTxOut(idStr);
            return CommonResult.setListResult(outList,"success", Constants.RETURNMSG1);
        }catch(Exception e)
        {
            e.printStackTrace();
            return CommonResult.setListResult(null,"success", Constants.RETURNMSG1);
        }

    }


}
