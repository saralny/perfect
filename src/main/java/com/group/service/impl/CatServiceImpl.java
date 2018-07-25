package com.group.service.impl;

import com.group.dto.PageModel;
import com.group.model.Cat;
import com.group.repository.CatRepository;
import com.group.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CatServiceImpl implements CatService{


    @Autowired
    private CatRepository catRepository;

    @Override
    public List<Cat> findAll() {
        List<Cat> list = catRepository.findAll();
        return list;
    }

    @Override
    public List<Map<String, Object>> listBySQL() {
        return catRepository.listBySQL(" select * from t_cat ");
    }

    @Override
    public Map<String, Object> mapBySQL() {
        return catRepository.mapBySQL(" select * from t_cat ");
    }

    @Override
    public PageModel<Map<String, Object>> leafBySQL(Integer currentPage, Integer pageSize) {
        return catRepository.LeafBySQL(currentPage, pageSize, " select * from t_cat ");
    }
}
