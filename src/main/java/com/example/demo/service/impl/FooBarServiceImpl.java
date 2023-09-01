package com.example.demo.service.impl;

import com.example.demo.dao.FooBar;
import com.example.demo.dao.FooBarExample.Criteria;
import com.example.demo.dao.FooBarExample;
import com.example.demo.dao.FooBarMapper;
import com.example.demo.domain.req.foobar.FooBarReq;
import com.example.demo.domain.req.foobar.QueryFooBarReq;
import com.example.demo.domain.rsp.Paged;
import com.example.demo.domain.rsp.foobar.FooBarRsp;
import com.example.demo.service.FooBarService;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class FooBarServiceImpl implements FooBarService {
    
    @Resource
    private FooBarMapper fooBarMapper;

    @Override
    public Paged<FooBarRsp> query(QueryFooBarReq req) {
        Paged<FooBarRsp> paged = new Paged<FooBarRsp>();
        paged.setPageNo(req.getPageNo());
        paged.setPageSize(req.getPageSize());
        FooBarExample example = new FooBarExample();
        if (req.getOrderBy() != null && req.getOrderBy().trim().length() > 0) {
            example.setOrderByClause(req.getOrderBy());
        }
        FooBarExample.Criteria criteria = example.createCriteria();
        buildCriteria(req, criteria);
        long total = fooBarMapper.countByExample(example);
        paged.setTotal(total);
        if (total == 0) {
            return paged;
        }
        RowBounds rowBounds = new RowBounds((paged.getPageNo() - 1) * paged.getPageSize(), paged.getPageSize());
        List<FooBar> fooBarList = fooBarMapper.selectByExampleWithRowbounds(example, rowBounds);
        List<FooBarRsp> fooBarRspList = new ArrayList<>();
        for (FooBar fooBar : fooBarList) {
            FooBarRsp fooBarRsp = new FooBarRsp();
            BeanUtils.copyProperties(fooBar, fooBarRsp);
            fooBarRspList.add(fooBarRsp);
        }
        paged.setData(fooBarRspList);
        return paged;
    }

    @Override
    public Integer create(FooBarReq req) {
        FooBar fooBar = new FooBar();
        BeanUtils.copyProperties(req, fooBar);
        return fooBarMapper.insertSelective(fooBar);
    }

    @Override
    public FooBarRsp selectById(Long id) {
        if (id == null) {
            return null;
        }
        FooBar fooBar = fooBarMapper.selectByPrimaryKey(id);
        if (fooBar == null) {
            return null;
        }
        FooBarRsp fooBarRsp = new FooBarRsp();
        BeanUtils.copyProperties(fooBar, fooBarRsp);
        return fooBarRsp;
    }

    @Override
    public Integer deleteById(Long id) {
        if (id == null) {
            return 0;
        }
        FooBar fooBar = fooBarMapper.selectByPrimaryKey(id);
        if (fooBar == null) {
            return 0;
        }
        return fooBarMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer updateById(FooBarReq req) {
        if (req == null || req.getId() == null) {
            return 0;
        }
        FooBar fooBar = fooBarMapper.selectByPrimaryKey(req.getId());
        if (fooBar == null) {
            return 0;
        }
        BeanUtils.copyProperties(req, fooBar);
        return fooBarMapper.updateByPrimaryKeySelective(fooBar);
    }

    private void buildCriteria(QueryFooBarReq req, Criteria criteria) {
        if (req.getId() != null) {
            criteria.andIdEqualTo(req.getId());
        }
        if (req.getFoo() != null && req.getFoo().trim().length() > 0) {
            criteria.andFooEqualTo(req.getFoo());
        }
        if (req.getBar() != null && req.getBar().trim().length() > 0) {
            criteria.andBarEqualTo(req.getBar());
        }
        if (req.getCreatedDate() != null) {
            criteria.andCreatedDateEqualTo(req.getCreatedDate());
        }
        if (req.getCreatedBy() != null && req.getCreatedBy().trim().length() > 0) {
            criteria.andCreatedByEqualTo(req.getCreatedBy());
        }
        if (req.getLastUpdatedDate() != null) {
            criteria.andLastUpdatedDateEqualTo(req.getLastUpdatedDate());
        }
        if (req.getLastUpdatedBy() != null && req.getLastUpdatedBy().trim().length() > 0) {
            criteria.andLastUpdatedByEqualTo(req.getLastUpdatedBy());
        }
        if (req.getFlag() != null) {
            criteria.andFlagEqualTo(req.getFlag());
        }
    }
}