package com.group.service;

import com.group.dto.PageModel;
import com.group.model.Cat;

import java.util.List;
import java.util.Map;

public interface CatService {
    List<Cat> findAll();

    List<Map<String, Object>> listBySQL();

    Map<String,Object> mapBySQL();

    PageModel<Map<String, Object>> leafBySQL(Integer currentPage, Integer pageSize);
}
