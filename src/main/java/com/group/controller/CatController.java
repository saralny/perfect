package com.group.controller;

import com.group.dto.PageModel;
import com.group.model.Cat;
import com.group.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class CatController {

    @Autowired
    private CatService catService;

    @RequestMapping("/cat")
    public String Cat(){
        return "index";
    }

    @RequestMapping("/cat/findAll")
    @ResponseBody
    public List<Cat> findAll(){
        List<Cat> list = catService.findAll();

        return list;
    }

    @RequestMapping("/cat/listBySQL")
    @ResponseBody
    public List<Map<String, Object>> listBySQL(){
        return catService.listBySQL();
    }

    @RequestMapping("/cat/mapBySQL")
    @ResponseBody
    public Map<String, Object> mapBySQL(){
        return catService.mapBySQL();
    }

    @RequestMapping("/cat/leafBySQL")
    @ResponseBody
    public PageModel<Map<String, Object>> leafBySQL(Integer currentPage, Integer pageSize){
        return catService.leafBySQL(currentPage, pageSize);
    }

}
