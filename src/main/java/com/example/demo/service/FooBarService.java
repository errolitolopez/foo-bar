package com.example.demo.service;

import com.example.demo.domain.req.foobar.FooBarReq;
import com.example.demo.domain.req.foobar.QueryFooBarReq;
import com.example.demo.domain.rsp.Paged;
import com.example.demo.domain.rsp.foobar.FooBarRsp;

public interface FooBarService {
    Paged<FooBarRsp> query(QueryFooBarReq req);

    Integer create(FooBarReq req);

    FooBarRsp selectById(Long id);

    Integer deleteById(Long id);

    Integer updateById(FooBarReq req);
}