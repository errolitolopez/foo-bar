package com.example.demo.facade.impl;

import com.example.demo.domain.req.foobar.FooBarReq;
import com.example.demo.domain.req.foobar.QueryFooBarReq;
import com.example.demo.domain.rsp.Paged;
import com.example.demo.domain.rsp.Response;
import com.example.demo.domain.rsp.foobar.FooBarRsp;
import com.example.demo.facade.FooBarFacade;
import com.example.demo.service.FooBarService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class FooBarFacadeImpl implements FooBarFacade {
    
    @Resource
    private FooBarService fooBarService;

    @Override
    public Response<Paged<FooBarRsp>> query(QueryFooBarReq req) {
        Response response = new Response();
        response.setResult(fooBarService.query(req));
        return response;
    }

    @Override
    public Response<Integer> create(FooBarReq req) {
        Response response = new Response();
        response.setResult(fooBarService.create(req));
        return response;
    }

    @Override
    public Response<FooBarRsp> selectById(Long id) {
        Response response = new Response();
        response.setResult(fooBarService.selectById(id));
        return response;
    }

    @Override
    public Response<Integer> deleteById(Long id) {
        Response response = new Response();
        response.setResult(fooBarService.deleteById(id));
        return response;
    }

    @Override
    public Response<Integer> updateById(FooBarReq req) {
        Response response = new Response();
        response.setResult(fooBarService.updateById(req));
        return response;
    }
}