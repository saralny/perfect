package com.group.repository.common;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.group.dto.PageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

// 基础Repository
@NoRepositoryBean
public interface BaseRepository<E,ID extends Serializable>  extends JpaRepository<E,ID>{

    List<Map<String, Object>> listBySQL(String sql);
    Map<String, Object> mapBySQL(String sql);
    PageModel<Map<String, Object>> LeafBySQL(Integer currentPage, Integer pageSize, String sql);
}
