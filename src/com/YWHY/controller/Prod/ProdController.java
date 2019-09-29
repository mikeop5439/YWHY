package com.YWHY.controller.Prod;

import com.YWHY.bean.ProdType;
import com.YWHY.bean.more.OrderCount;
import com.YWHY.service.ProdType.service.ProdTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("prod")
public class ProdController {
    @Autowired
    private ProdTypeService prodTypeService;

    @RequestMapping("queryAllProds")
    public @ResponseBody
    List<ProdType> queryAllProds(){
        return  prodTypeService.selectOfAll();
    }
}
