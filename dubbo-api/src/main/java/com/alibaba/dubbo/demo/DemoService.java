package com.alibaba.dubbo.demo;

import java.util.List;

/**
 * @author zhch
 */
public interface DemoService {
    List<String> getPermissions(Long id);
}