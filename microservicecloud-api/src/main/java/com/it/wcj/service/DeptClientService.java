package com.it.wcj.service;

import com.it.wcj.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Feign的核心思想就是“接口+注解”的方式，实现负载均衡
 */
@FeignClient(value = "microservicecloud-provider-dept")
public interface DeptClientService {

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    boolean add(Dept dept);

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    Dept get(@PathVariable("id") Long id);

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    List<Dept> list();
}
