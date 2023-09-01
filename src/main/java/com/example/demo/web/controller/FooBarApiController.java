package com.example.demo.web.controller;

import com.example.demo.domain.req.foobar.FooBarReq;
import com.example.demo.domain.req.foobar.QueryFooBarReq;
import com.example.demo.domain.rsp.Paged;
import com.example.demo.domain.rsp.Response;
import com.example.demo.domain.rsp.foobar.FooBarRsp;
import com.example.demo.facade.FooBarFacade;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foo-bar")
public class FooBarApiController {
    
    @Resource
    private FooBarFacade fooBarFacade;

    @GetMapping("/query")
    public Response<Paged<FooBarRsp>> query(QueryFooBarReq req) {
        return fooBarFacade.query(req);
    }

    @PostMapping("/create")
    public Response<Integer> create(FooBarReq req) {
        return fooBarFacade.create(req);
    }

    @GetMapping("/select")
    public Response<FooBarRsp> selectById(Long id) {
        return fooBarFacade.selectById(id);
    }

    @PostMapping("/delete")
    public Response<Integer> deleteById(Long id) {
        return fooBarFacade.deleteById(id);
    }

    @PostMapping("/update")
    public Response<Integer> updateById(FooBarReq req) {
        return fooBarFacade.updateById(req);
    }
}