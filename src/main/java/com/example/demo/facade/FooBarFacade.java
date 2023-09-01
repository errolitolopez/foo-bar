package com.example.demo.facade;

import com.example.demo.domain.req.foobar.FooBarReq;
import com.example.demo.domain.req.foobar.QueryFooBarReq;
import com.example.demo.domain.rsp.Paged;
import com.example.demo.domain.rsp.Response;
import com.example.demo.domain.rsp.foobar.FooBarRsp;

public interface FooBarFacade {
    Response<Paged<FooBarRsp>> query(QueryFooBarReq req);

    Response<Integer> create(FooBarReq req);

    Response<FooBarRsp> selectById(Long id);

    Response<Integer> deleteById(Long id);

    Response<Integer> updateById(FooBarReq req);
}