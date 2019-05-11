package com.zz.service;

import com.zz.entity.Computer;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

@CacheConfig(cacheNames = "computer")
public interface ComputerService {

    int deleteByPrimaryKey(Long id);

    int insert(Computer record);

    int insertSelective(Computer record);
    @Cacheable(key = "#p0")
    Computer selectByPrimaryKey(Long id);
    @CachePut(key = "#p0.sno")
    int updateByPrimaryKeySelective(Computer record);

    int updateByPrimaryKey(Computer record);
}
