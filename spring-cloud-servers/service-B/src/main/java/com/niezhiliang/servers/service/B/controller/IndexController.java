package com.niezhiliang.servers.service.B.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author NieZhiLiang
 * @Email nzlsgg@163.com
 * @Date 2018/10/23 上午11:21
 */
@RestController
@RequestMapping(value = "/")
@RefreshScope
public class IndexController {

    @Value("${world}")
    private String world;

    @RequestMapping(value = "index")
    public String index (){
        return world;
    }
}
